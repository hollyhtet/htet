package com.stz.stzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.List;

public class MovieShowCase extends AppCompatActivity {
    AdView mAdView;
    AdView mAdView2;
    ListView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_show_case);
        MobileAds.initialize(this,"ca-app-pub-9355307986593731~8329454923");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView2 = findViewById(R.id.adView2);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView2.loadAd(adRequest2);


        gridView=findViewById(R.id.gridview);
        MovieModel mm1= new MovieModel();
        mm1.movieimagelink="https://upload.wikimedia.org/wikipedia/en/thumb/4/4d/The_Tale_of_Nokdu.jpg/250px-The_Tale_of_Nokdu.jpg";
        mm1.moviename="Tale of Nokdu";

        MovieModel mm2= new MovieModel();
        mm2.movieimagelink="https://upload.wikimedia.org/wikipedia/en/6/67/Melting_Me_Softly.jpg";
        mm2.moviename="Melting Me Softly";

        ArrayList<MovieModel> mms= new ArrayList<MovieModel>();
        mms.add(mm1);
        mms.add(mm2);

        MovieAdapter Adapter= new MovieAdapter(mms);
        gridView.setAdapter(Adapter);

    }

    private class MovieAdapter extends BaseAdapter{

        ArrayList<MovieModel> mms= new ArrayList<MovieModel>();

        public MovieAdapter(ArrayList<MovieModel> mms) {
            this.mms = mms;
        }
        @Override
        public int getCount() {
            return mms.size();
        }

        @Override
        public Object getItem(int position) {
            return mms.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater=getLayoutInflater();
            View view=inflater.inflate(R.layout.movieimage,null);
            final MovieModel movieModel=mms.get(position);
            ImageView imageView=view.findViewById(R.id.image1);
            TextView moviename=view.findViewById(R.id.moviename);
            Glide.with(getApplicationContext())
                    .load(movieModel.movieimagelink)
                    .into(imageView);
            moviename.setText(movieModel.moviename);

            return view;
        }
    }

}

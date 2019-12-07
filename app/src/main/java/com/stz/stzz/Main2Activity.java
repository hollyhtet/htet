package com.stz.stzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView imgview = findViewById(R.id.imgview);
        Glide.with(getApplicationContext()).load("https://image.tmdb.org/t/p/w185/r8BhphHIruCL2jM4sd1Zs6sMJov.jpg").into(imgview);


    }
}

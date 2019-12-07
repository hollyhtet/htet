package com.stz.stzz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Timepicker extends AppCompatActivity {

    public static TextView showtime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepicker);

        showtime=findViewById(R.id.showtime);

    }

    public void btnShow(View view) {
        FragmentManager fm=getSupportFragmentManager();
        PopTime poptime=new PopTime();
        poptime.show(fm,"Show Fragment");

    }
}

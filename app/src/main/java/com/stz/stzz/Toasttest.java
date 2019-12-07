package com.stz.stzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class Toasttest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toasttest);
    }

    public void login(View view) {
        LayoutInflater lf=getLayoutInflater();
        View convertview=lf.inflate(R.layout.activity_welcomelogin,null);
        Toast toast= new Toast(getApplicationContext());
        toast.setView(convertview);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
}

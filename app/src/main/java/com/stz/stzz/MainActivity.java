package com.stz.stzz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView btnview= findViewById(R.id.bottomnav);

        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.mainframe, new homeFragment());
        ft.commit();

        btnview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if(menuItem.getItemId()==R.id.home)
                {
                  //  Toast.makeText(getApplicationContext(),"Home",Toast.LENGTH_LONG).show();
                    FragmentManager fm=getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.mainframe, new homeFragment());
                    ft.commit();
                }
                 if(menuItem.getItemId()==R.id.msg)
                {
                  //  Toast.makeText(getApplicationContext(),"Message",Toast.LENGTH_LONG).show();
                    FragmentManager fm=getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.mainframe, new msgfragment());
                    ft.commit();
                }

                return true;
            }
        });
    }
    }
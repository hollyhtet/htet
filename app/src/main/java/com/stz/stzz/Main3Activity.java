package com.stz.stzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final CheckBox chkbox = findViewById(R.id.chkbox);
        chkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chkbox.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Status is checked", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Status is not checked", Toast.LENGTH_LONG).show();
                }
            }
        });


    }

    public void submitcheckbox(View view) {
        CheckBox checkbox=findViewById(R.id.chkbox)  ;
      if(  checkbox.isChecked())
      {
          Toast.makeText(getApplicationContext(),"Status is checked", Toast.LENGTH_LONG).show();
      }
      else
      {
          Toast.makeText(getApplicationContext(),"Status is not checked", Toast.LENGTH_LONG).show();
      }

    }
}

package com.stz.stzz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.sql.Time;

public class PopTime extends DialogFragment implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        dismiss();
        String selectedtime= tp.getMonth()+ "-" + tp.getYear();
        Timepicker.showtime.setText(selectedtime);
    }

    View view;
    Button btndone;
    DatePicker tp;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.timepickerdialog,container,false);
        tp=(DatePicker) view.findViewById(R.id.datep);

        btndone=view.findViewById(R.id.btndone);
        btndone.setOnClickListener(this);

        return view;



    }
}

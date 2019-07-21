package com.tkb.certification.android_core.picker;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tkb.certification.R;

public class PickerActivity extends AppCompatActivity implements PickerCallBack{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }



    public void showDatePicker(View view) {

    }

    @Override
    public void processDatePickerResult(int year, int month, int dayOfMonth){

    }


    public void showTimePicker(View view) {
        DialogFragment fragment = new TimePickerFragment();
        fragment.show(getSupportFragmentManager(), getString(R.string.time_picker));
    }

    @Override
    public void processTimePickerResult(int hour, int minute){
        String hour_string = Integer.toString(hour);
        String minute_string = Integer.toString(minute);
        String time_message = hour_string + ":" + minute_string;
        Toast.makeText(getApplicationContext(), "Time: " + time_message, Toast.LENGTH_SHORT).show();
    }
}

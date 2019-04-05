package com.example.holiday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class TodayFragment extends  AppCompatActivity {
    DatePicker datePicker;
    TextView textView;
    Button tampilkan;
    int month;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_today);
        datePicker=(DatePicker)findViewById(R.id.datePicker);
        textView=(TextView)findViewById(R.id.txt1);
        textView.setText("Display Date");
        tampilkan= (Button)findViewById(R.id.button);
        textView.setText(currentDate());
        tampilkan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText(currentDate());
            }
        });
    }

    public String currentDate(){
        StringBuilder mcurrentDate = new StringBuilder();
        month = datePicker.getMonth() +1;
        mcurrentDate.append("Date : " +month + "/" + datePicker.getDayOfMonth() + "/" + datePicker.getYear());
        return mcurrentDate.toString();
    }
}

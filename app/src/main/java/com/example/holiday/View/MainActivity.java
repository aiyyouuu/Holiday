package com.example.holiday.View;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.holiday.R;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnCari;
    private TextView info;

    private String kata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("Next", MODE_PRIVATE);
        final SharedPreferences.Editor editor = preferences.edit();

        info = findViewById(R.id.in);
        kata = preferences.getString("Tanggal Yang Dicari","");

        if (!kata.equals("")){
            info.setText("Tanggal : " + kata);
        }
        radioGroup = (RadioGroup) findViewById(R.id.rbGrup);
        btnCari = (Button) findViewById(R.id.btn_cari);
        addListenerOnButtonCari();
    }

    public void addListenerOnButtonCari(){
        btnCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                switch (selectedId){
                    case R.id.rdIndo :
                        startActivity(new Intent(getApplicationContext(),TodayActivity.class));
                        break;
                    case R.id.rdUS :
                        startActivity(new Intent(getApplicationContext(),TodayActivity.class));
                        break;
                }
            }
        });
    }
}

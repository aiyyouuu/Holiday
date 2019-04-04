package com.example.holiday;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnCari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                        Toast.makeText(MainActivity.this,"You Clicked" + radioButton.getText(), Toast.LENGTH_SHORT).show();
                        Intent a = new Intent(getApplicationContext(),Kalender_Indonesia.class);
                        startActivity(a);
                        break;
                    case R.id.rdUS :
                        Toast.makeText(MainActivity.this,"You Clicked" + radioButton.getText(), Toast.LENGTH_SHORT).show();
                        Intent b = new Intent(getApplicationContext(),Kalender_Indonesia.class);
                        startActivity(b);
                        break;
                }
            }
        });
    }
}

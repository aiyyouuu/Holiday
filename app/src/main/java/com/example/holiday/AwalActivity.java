package com.example.holiday;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AwalActivity extends AppCompatActivity {
    private EditText input;
    private Button cari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awal);

        input = findViewById(R.id.et_input);
        cari = findViewById(R.id.btn_cari);

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("Next", MODE_PRIVATE);
        final SharedPreferences.Editor editor = preferences.edit();

        cari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input.getText().toString().equals("")){
                    editor.putString("Tanggal Yang Disimpan", input.getText().toString());
                    editor.commit();

                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }else{
                    Toast.makeText(getApplicationContext(), "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

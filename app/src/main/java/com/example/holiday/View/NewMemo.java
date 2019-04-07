package com.example.holiday.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.holiday.Fragment.MemoFragment;
import com.example.holiday.R;

public class NewMemo extends AppCompatActivity {
   EditText NamaNote, TanggalNote, Keterangan;
   Button btnTambah, btnBack;
   CheckBox KeepData;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_memo);

        NamaNote = (EditText) findViewById(R.id.et_judul);
       TanggalNote = (EditText) findViewById(R.id.et_tanggal);
       Keterangan = (EditText) findViewById(R.id.et_keterangan);

       KeepData = (CheckBox) findViewById(R.id.keepData);

       btnTambah = (Button) findViewById(R.id.btn_tambah);
       btnBack = (Button) findViewById(R.id.btn_kembali);
       btnBack.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(NewMemo.this, MemoFragment.class);
               startActivity(intent);
           }
       });
    }
}

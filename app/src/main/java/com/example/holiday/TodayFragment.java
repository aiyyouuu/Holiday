package com.example.holiday;


import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 */
public class TodayFragment extends Fragment {
            private DatePickerDialog datePickerDialog;
            private SimpleDateFormat dateFormatter;
            private TextView Indo;

    public TodayFragment() {
                // Required empty public constructor
            }


            @Override
            public View onCreateView(LayoutInflater inflater, ViewGroup container,
                    Bundle savedInstanceState) {
                View view = inflater.inflate(R.layout.fragment_today, container, false);
                dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

                showDateDialog();
                return view;
    }

    private void showDateDialog(){
        Calendar newCalendar = Calendar.getInstance();

        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
            }
        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

}

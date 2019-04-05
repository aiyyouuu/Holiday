package com.example.holiday;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Kalender_Indonesia extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    Fragment fragment;
    TextView userrr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalender__indonesia);
        bottomNavigationView = findViewById(R.id.bnv);
        startActivity(new Intent(getApplicationContext(),TodayFragment.class));
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment){
        if(fragment!=null){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
            return true;
        }
        return false;
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.menu1:
                startActivity(new Intent(getApplicationContext(),Kalender_Indonesia.class));
                break;

            /*case R.id.menu2:
                fragment = new AllFragment();
                break;*/
        }
        return loadFragment(fragment);
    }
}

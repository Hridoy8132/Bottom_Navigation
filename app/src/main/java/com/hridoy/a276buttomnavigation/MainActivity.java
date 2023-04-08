package com.hridoy.a276buttomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView buttomNavigation;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttomNavigation= findViewById(R.id.buttomNavigation);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttomNavigation.getOrCreateBadge(R.id.home).setNumber(13);
            }

        });

        buttomNavigation.getOrCreateBadge(R.id.notification).setNumber(100);

        buttomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

              if (item.getItemId()==R.id.home)
              {
                  Toast.makeText(getApplicationContext(),"This is home",Toast.LENGTH_LONG).show();

              }

               else if (item.getItemId()==R.id.notification)
                {
                    Toast.makeText(getApplicationContext(),"This is notification",Toast.LENGTH_LONG).show();

                }

              else if (item.getItemId()==R.id.profile)
              {
                  Toast.makeText(getApplicationContext(),"This is profile",Toast.LENGTH_LONG).show();

              }

                return false;
            }
        });
    }
}
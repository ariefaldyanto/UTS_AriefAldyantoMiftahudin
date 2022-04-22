package com.example.uts_ariefaldyantomiftahudin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView cvAdd, cvAdd1, cvAdd2, cvAdd3, cvAdd4, cvAdd5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvAdd = (CardView)findViewById(R.id.cvAdd);

        cvAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Menu Book", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), BookActivity.class));
            }
        });

        cvAdd1 = (CardView)findViewById(R.id.cvAdd1);

        cvAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Menu Calender", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), CalenderActivity.class));
            }
        });

        cvAdd2 = (CardView)findViewById(R.id.cvAdd2);

        cvAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Profile Saya", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
            }
        });

        cvAdd3 = (CardView)findViewById(R.id.cvAdd3);

        cvAdd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Menu Report", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), ReportActivity.class));
            }
        });

        cvAdd4 = (CardView)findViewById(R.id.cvAdd4);

        cvAdd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Menu Star", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), StarActivity.class));
            }
        });

        cvAdd5 = (CardView)findViewById(R.id.cvAdd5);

        cvAdd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Menu Settings", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
            }
        });
    }
}
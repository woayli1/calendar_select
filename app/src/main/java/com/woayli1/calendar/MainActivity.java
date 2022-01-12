package com.woayli1.calendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.single)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, CalendarSelectAcitivity.class);
                        intent.putExtra("flag", "single");
                        startActivity(intent);
                    }
                });

        findViewById(R.id.mult)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, CalendarSelectAcitivity.class);
                        intent.putExtra("flag", "mult");
                        startActivity(intent);
                    }
                });
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = findViewById(R.id.start);
        start.setOnClickListener(v -> {
            Intent nextScreen = new Intent(getApplicationContext(), SecondActivity.class);
            startActivity(nextScreen);
        });

        Button shop = findViewById(R.id.shopButton);
        shop.setOnClickListener(v -> {
            Intent nextScreen1 = new Intent(getApplicationContext(), ShopActivity.class);
            startActivity(nextScreen1);
        });
    }
}

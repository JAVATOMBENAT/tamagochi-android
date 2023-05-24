package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ShopActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopactivity);

        List<com.example.myapplication.Consomable> consomableItemsList = new ArrayList<>();
        consomableItemsList.add(new com.example.myapplication.Consomable("potion regeneratrice", 10, "joie"));
        consomableItemsList.add(new com.example.myapplication.Consomable("pate au beurre", 5, "pate"));
        consomableItemsList.add(new com.example.myapplication.Consomable("pizza dela mama ", 12, "pizza"));
        consomableItemsList.add(new com.example.myapplication.Consomable("elixir de soin", 5, "soin"));
        consomableItemsList.add(new com.example.myapplication.Consomable("potion de vie", 12, "vie"));

        ListView shopListView = findViewById(R.id.shop_list_view);
        shopListView.setAdapter(new ConsombleAdapter(this, consomableItemsList));
    }
}

package com.example.francesinhas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertsActivity extends AppCompatActivity {

    ListView dessertsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);


        findViews();

        Dish[] desserts = {
                new Dish("Mousse de Oreo", "11/10",500),
                new Dish("Bolo de Bolacha", "9/10",500),
                new Dish("Baba de Camelo", "11/10",500),
                new Dish("Tarte de Oreo", "9/10",500),
                new Dish("Natas do Céu", "8/10",500),
        };

        ArrayAdapter<Dish> dessertsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desserts);
        dessertsListView.setAdapter(dessertsAdapter);
    }

    private void findViews() {

        dessertsListView = findViewById(R.id.list_view_desserts);
    }
}
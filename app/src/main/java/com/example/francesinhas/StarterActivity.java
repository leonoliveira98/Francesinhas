package com.example.francesinhas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StarterActivity extends AppCompatActivity {

    ListView startersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        findViews();

        Dish[] dishes = {
                new Dish("Asas de frango","5/10",800),
                new Dish("Picapau","8/10",599),
                new Dish("Rissois","8/10",400),
                new Dish("Azeitonas","2/10",300),
                new Dish("Nachos","4/10",700),
                new Dish("Pate","6/10",150),
                new Dish("Queijo","7/10",500),
                new Dish("Nuggets","6/10",700),
                new Dish("Douradinhos","2/10",550),
                new Dish("Rojões","7/10",700),
        };


        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);

    }

    private void findViews() {

        startersList = findViewById(R.id.list_view_starters);

    }


}
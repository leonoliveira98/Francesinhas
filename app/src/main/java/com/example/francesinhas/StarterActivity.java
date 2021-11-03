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

        Dish dishOne = new Dish("Francesinha Hamburgo","10/10",999);


        String[] dishes = {
                "Francesinha Hamburgo",
                "Francesinha Café D.joão",
                "Francesinha Santiago",
                "Francesinha Farao",
                "Francesinha Lado B",
                "Francesinha Locanda",
                "Francesinha Londrina",
                "Francesinha Taberna Belga",
                "Francesinha Hamburgo",
                "Francesinha com alface",
                "Francesinha Yoko",
                "Francesinha Brasão",
                "Francesinha Santiago II",
                "Francesinha Olivier",
                "Francesinha Rosa",
                "Francesinha Vegetariana",
                "Francesinha Económica",
                "Meia Francesinha",
                "Francesinha Casino",
                "Francesinha Golfinho",
        };

        ArrayAdapter<String> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);

    }

    private void findViews() {

        startersList = findViewById(R.id.list_view_starters);

    }


}
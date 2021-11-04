package com.example.francesinhas;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {

    ListView mainCoursesList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        findViews();


        Dish[] mainCourses = {
                new Dish("Francesinha Hamburgo","10/10",999),
                new Dish("Francesinha Santiago","8/10",1000),
                new Dish("Francesinha Locanda","6/10",999),
                new Dish("Francesinha Café D.João","8/10",1000),
                new Dish("Francesinha Farao","7.5/10",999),
                new Dish("Francesinha Lado B","8/10",999),
                new Dish("Francesinha c/ Alface","-1/10",99),
                new Dish("Francesinha Taberna Belga","?/10",999),
                new Dish("Francesinha Taberna Londrina","7.5/10",1200),
                new Dish("Francesinha Golfinho","8/10",1100)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCourses);
        mainCoursesList.setAdapter(dishesAdapter);
    }

    private void findViews() {


        mainCoursesList = findViewById(R.id.list_view_main_courses);
    }
}

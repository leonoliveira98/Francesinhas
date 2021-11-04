package com.example.francesinhas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;
    CardView dessertsCard;
    TextView emailTextVIew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        cardOnClick();
        emailOnClick();
    }

    private void emailOnClick() {
        emailTextVIew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);

                launchEmailAppIntent.setData(Uri.parse("mailto:leonardo-t-oliveira@hotmail.com"));
                startActivity(launchEmailAppIntent);
            }
        });
    }

    private void cardOnClick() {

        // Quando se carrega nas Cards
        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startersActivityIntent = new Intent(MainActivity.this, StarterActivity.class);

                startActivity(startersActivityIntent);
            }
        });

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);

                startActivity(mainCoursesActivityIntent);
            }
        });

        dessertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessertsActivity = new Intent(MainActivity.this, DessertsActivity.class);

                startActivity(dessertsActivity);
            }
        });
    }

    private void findViews(){

        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_mains);
        dessertsCard = findViewById(R.id.card_view_desserts);
        emailTextVIew = findViewById(R.id.text_view_email_address);
    }
}
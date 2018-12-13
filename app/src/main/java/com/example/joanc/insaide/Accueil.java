package com.example.joanc.insaide;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);
        ImageButton homeButton = findViewById(R.id.homebutton);
        ImageButton searchButton = findViewById(R.id.searchbutton);
        ImageButton addButton = findViewById(R.id.addbutton);
        homeButton.setColorFilter(Color.argb(255, 255, 0,0));
        searchButton.setColorFilter(Color.argb(255, 0, 0,0));
        addButton.setColorFilter(Color.argb(255, 0, 0,0));

    }
}

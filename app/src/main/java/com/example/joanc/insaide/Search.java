package com.example.joanc.insaide;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        ImageButton homeButton = findViewById(R.id.homebutton);
        ImageButton searchButton = findViewById(R.id.searchbutton);
        ImageButton addButton = findViewById(R.id.addbutton);
        homeButton.setColorFilter(Color.argb(255, 0, 0,0));
        searchButton.setColorFilter(Color.argb(255, 255, 0,0));
        addButton.setColorFilter(Color.argb(255, 0, 0,0));

        Spinner spinnerMatieres = findViewById(R.id.spinnerMatieres);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.matieres, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMatieres.setAdapter(adapter);

        Spinner spinnerJours = findViewById(R.id.spinnerJours);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.jours, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerJours.setAdapter(adapter2);

    }
}

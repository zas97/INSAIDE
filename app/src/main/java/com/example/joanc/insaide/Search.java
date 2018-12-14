package com.example.joanc.insaide;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class Search extends AppCompatActivity {
    Button search;
    Button notify;
    LinearLayout tohide;
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

        Spinner spinnerReputation = findViewById(R.id.spinnerReputation);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.reputation, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerReputation.setAdapter(adapter3);

        final Button visitButton = (Button) findViewById(R.id.visitButton);
        visitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Search.this, consultation_tutorat.class);
                startActivity(intent);
            }
        });

        search = (Button) findViewById(R.id.searchButton);
        tohide = (LinearLayout) findViewById(R.id.tohide);
        tohide.setVisibility(tohide.INVISIBLE);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tohide.setVisibility(tohide.VISIBLE);
            }
        });

        notify = (Button) findViewById(R.id.searchButton3);
        notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    public void openDialog(){
        Confirmation dialog = new Confirmation();
        dialog.show(getSupportFragmentManager(),"Confirmation");
    }
}

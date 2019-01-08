package com.example.joanc.insaide;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

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

        final Button loginButton = (Button) findViewById(R.id.button3);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accueil.this, Login.class);
                startActivity(intent);
            }
        });

        final TextView details2 = (TextView) findViewById(R.id.textView28);
        details2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accueil.this, consultationTutoratInscrit.class);
                startActivity(intent);
            }
        });
    }
}

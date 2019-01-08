package com.example.joanc.insaide;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class PropTutoratPonctuel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prop_tutorat_ponctuel);
        ImageButton homeButton = findViewById(R.id.homebutton);
        ImageButton searchButton = findViewById(R.id.searchbutton);
        ImageButton addButton = findViewById(R.id.addbutton);
        homeButton.setColorFilter(Color.argb(255, 0, 0,0));
        searchButton.setColorFilter(Color.argb(255, 0, 0,0));
        addButton.setColorFilter(Color.argb(255, 255, 0,0));

        final Button loginButton = (Button) findViewById(R.id.validerTuto);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PropTutoratPonctuel.this, Accueil.class);
                startActivity(intent);
            }
        });
    }

    public boolean onContextItemSelected (MenuItem item) {
        RadioButton ponctuel = findViewById(R.id.ponctuelRadioBtn);
        RadioButton recurent = findViewById(R.id.recurrentRadioBtn);
        if(ponctuel.isSelected())
        {
            ponctuel.setBackgroundColor(Color.argb(255, 255, 0,0));
            recurent.setBackgroundColor(Color.argb(255, 0, 0,0));
        }
        else
        {
            ponctuel.setBackgroundColor(Color.argb(255, 0, 0,0));
            recurent.setBackgroundColor(Color.argb(255, 255, 0,0));
        }
        return true;
    }


}

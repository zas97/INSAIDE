package com.example.joanc.insaide;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PropTutoratPonctuel extends AppCompatActivity {

    TextView hide1;
    EditText hide2;
    TextView hide3;
    Spinner hide4;

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

        RadioButton ponctuel = findViewById(R.id.ponctuelRadioBtn);
        RadioButton recurent = findViewById(R.id.recurrentRadioBtn);

        hide1 = findViewById(R.id.hide1);
        hide2 = findViewById(R.id.hide2);
        hide3 = findViewById(R.id.hide3);
        hide4 = findViewById(R.id.hide4);


        hide1.setVisibility(hide1.INVISIBLE);
        hide2.setVisibility(hide2.INVISIBLE);

        ponctuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hide1.setVisibility(hide1.VISIBLE);
                hide2.setVisibility(hide2.VISIBLE);
                hide3.setVisibility(hide3.INVISIBLE);
                hide4.setVisibility(hide4.INVISIBLE);
            }
        });

        recurent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hide1.setVisibility(hide1.INVISIBLE);
                hide2.setVisibility(hide2.INVISIBLE);
                hide3.setVisibility(hide3.VISIBLE);
                hide4.setVisibility(hide4.VISIBLE);
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

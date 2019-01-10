package com.example.joanc.insaide;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class consultationTutoratInscrit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consultation_tutorat_inscrit);

        final Button desinscrit = (Button) findViewById(R.id.button);
        desinscrit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(consultationTutoratInscrit.this, consultation_tutorat.class);
                startActivity(intent);
            }
        });

        final Button evaluer = (Button) findViewById(R.id.button2);
        evaluer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(consultationTutoratInscrit.this, EvaluationTutorat.class);
                startActivity(intent);
            }
        });
    }
}

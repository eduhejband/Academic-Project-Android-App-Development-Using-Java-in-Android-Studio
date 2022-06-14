package com.example.guiab.kccup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Plenitud extends AppCompatActivity {
    Button fralda, absorvente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plenitud);

        fralda = findViewById(R.id.plenitudFralda);
        absorvente = findViewById(R.id.plenitudAbsorvente);

        fralda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plenitud.this, LimpezaUsoHomem.class));
            }
        });

        absorvente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plenitud.this, LimpezaUsoMulher.class));
            }
        });
    }
}

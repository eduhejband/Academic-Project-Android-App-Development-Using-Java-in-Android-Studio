package com.example.guiab.kccup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LimpezaUsoHomem extends AppCompatActivity {

    Button uso, limpeza;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limpeza_uso_homem);

        limpeza = findViewById(R.id.btnLimpezHomem);
        uso = findViewById(R.id.btnUsoHomem);

        uso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LimpezaUsoHomem.this, PlenitudHomem.class));
            }
        });

        limpeza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LimpezaUsoHomem.this, Lenco.class));
            }
        });
            }
}

package com.example.guiab.kccup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Huggies extends AppCompatActivity {

    Button fralda, troca, banho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huggies);

        fralda = findViewById(R.id.btnFralda);
        troca = findViewById(R.id.btnTroca);
        banho = findViewById(R.id.btnBanho);

        fralda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Huggies.this, HuggiesFralda.class));
            }
        });

        troca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Huggies.this, HuggiesTroca.class));
            }
        });

        banho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Huggies.this, HuggiesBanho.class));
            }
        });
    }
}

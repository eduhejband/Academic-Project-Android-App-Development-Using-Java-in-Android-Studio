
package com.example.guiab.kccup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LimpezaUsoMulher extends AppCompatActivity {

    Button limpeza, uso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limpeza_uso_mulher);

        limpeza = findViewById(R.id.btnLimpeza);
        uso = findViewById(R.id.btnUso);

        uso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LimpezaUsoMulher.this, PlenitudMulher.class));
            }
            });

                limpeza.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(LimpezaUsoMulher.this, Lenco.class));
                    }

                });

    }
}


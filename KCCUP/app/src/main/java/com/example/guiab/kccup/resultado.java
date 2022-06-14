package com.example.guiab.kccup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    TextView txtResult, txtResulte, txtResulto, txtResulttado, txtResulttad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtResult = findViewById(R.id.txtResultado);
        String result = getIntent().getStringExtra("chave");
        txtResult.setText(result);

       txtResulte = findViewById(R.id.txtResultadoM);
        String resulte = getIntent().getStringExtra("chave1");
        txtResulte.setText(resulte);

        txtResulto = findViewById(R.id.txtResultedo);
        String resulto = getIntent().getStringExtra("chave2");
        txtResulto.setText(resulto);

        txtResulttado = findViewById(R.id.txtResultt);
        String resultt = getIntent().getStringExtra("chave3");
        txtResulttado.setText(resultt);

        txtResulttad = findViewById(R.id.txtResultta);
        String resulttadi = getIntent().getStringExtra("chave4");
        txtResulttad.setText(resulttadi);
    }
}

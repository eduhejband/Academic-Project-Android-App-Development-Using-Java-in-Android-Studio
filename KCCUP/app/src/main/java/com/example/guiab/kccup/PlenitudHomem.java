package com.example.guiab.kccup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class PlenitudHomem extends AppCompatActivity {

    int a, b;
    // Criar int c, d; depois
    String resultadoFinal;
    Button ResHomem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plenitud_homem);

        ResHomem = findViewById(R.id.btnResultadoHomem);

        ResHomem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent (PlenitudHomem.this, resultado.class);
               intent.putExtra("chave", resultadoFinal);
               startActivity(intent);
            }
        });


    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()){
            case R.id.maiorInc:
                if(checked)
                    a = 1;
                break;

            case R.id.maiorMob:
                if(checked)
                    a = 2;
                break;

            case R.id.realFit:
                if(checked)
                    b = 1;
                break;

            case R.id.protectPlus:
                if(checked)
                    b = 2;
                break;
        }


        if (a == 1 && b == 1){
            // Real fit, porém Protect PLus
            resultadoFinal = "O produto indicado é Real Fit, porém Protect Plus também seria recomendável";

        }else{
            if (a == 2 && b == 1){
                resultadoFinal = "O produto mais recomendado é Real Fit";
                // Real Fit

            }else{
                if (a == 1 && b == 2){
                    resultadoFinal = "O produto mais recomendado é Protect Plus" ;
                    // Protect Plus

                }else{
                    if (a == 2 && b == 2){
                        resultadoFinal = "O produto mais recomendado é Protect Plus, porém Real Fit também é recomendado" ;
                        // Protect Plus, porém Real Fit

                    }
                }
            }
        }
}


}

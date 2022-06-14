package com.example.guiab.kccup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class PlenitudMulher extends AppCompatActivity {

    int e, f;
    // Criar int g, h; depois
    String resultadoFinalM;
    Button ResMulher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plenitud_mulher);

        ResMulher = findViewById(R.id.btnResultadoMulher);

        ResMulher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (PlenitudMulher.this, resultado.class);
                intent.putExtra("chave1", resultadoFinalM);
                startActivity(intent);
            }
        });

    }

    public void onRadioButtonClicked (View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()){
            case R.id.absBaixa:
                if(checked)
                e = 1;
                break;

            case R.id.absMedia:
                if(checked)
                    e = 2;
                break;

            case R.id.absAlta:
                if(checked)
                    e = 3;
                break;

            case R.id.absNoturna:
                if(checked)
                    e = 4;
                break;

            case R.id.maxDiscrição:
                if(checked)
                    f = 1;
                break;

            case R.id.confeDiscrição:
                if(checked)
                    f = 2;
                break;

            case R.id.segeDiscrição:
                if(checked)
                    f = 3;
                break;

            case R.id.todaProteção:
                if(checked)
                    f = 4;
                break;
        }

        if (e == 1 && f == 1){
            resultadoFinalM = "O produto mais recomendado é Protetor Médio ou Real Fit";

        }else{
            if (e == 1 && f == 2){
                resultadoFinalM = "O produto mais recomendado é Protetor Médio";

            }else{
                if (e == 1 && f == 3){
                    resultadoFinalM = "O produto mais recomendado é Absorvente Ultra";

                }else{
                    if (e == 1 && f == 4){
                        resultadoFinalM = "O produto mais recomendado é Real Fit";

                    }else{
                        if (e == 2 && f == 1){
                            resultadoFinalM = "O produto mais recomendado é Protetor Médio ou Real Fit";

                        }else{
                            if (e == 2 && f == 2){
                                resultadoFinalM = "O produto mais recomendado é Protetor Médio";

                            }else{
                                if (e == 2 && f == 3){
                                    resultadoFinalM = "O produto mais recomendado é Absorvente Ultra";

                                }else{
                                    if (e == 2 && f == 4){
                                        resultadoFinalM = "O produto mais recomendado é Protect Plus";

                                    }else{
                                        if (e == 3 && f == 1){
                                            resultadoFinalM = "O produto mais recomendado é Real Fit";

                                        }else{
                                            if (e == 3 && f == 2){
                                                resultadoFinalM = "O produto mais recomendado é Active Mulher";

                                            }else{
                                                if (e == 3 && f == 3){
                                                    resultadoFinalM = "O produto mais recomendado é Absorvente Ultra";

                                                }else{
                                                    if (e == 3 && f == 4){
                                                        resultadoFinalM = "O produto mais recomendado é Protect Plus";

                                                    }else{
                                                        if (e == 4 ){
                                                            resultadoFinalM = "O produto mais recomendado é Absorvente Noturno";


    }




}}}}}}}}}}}}}}

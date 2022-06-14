package com.example.guiab.kccup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class HuggiesFralda extends AppCompatActivity {

    int j, k;
    String resultadoFinalHuggiesFralda;
    Button ResHuggiesFralda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huggies_fralda);

        ResHuggiesFralda = findViewById(R.id.btnResultadoHuggiesFralda);

        ResHuggiesFralda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (HuggiesFralda.this, resultado.class);
                intent.putExtra("chave2", resultadoFinalHuggiesFralda);
                startActivity(intent);
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.suavidade:
                if(checked)
                    j = 1;
                    break;

            case R.id.provaDagua:
                if(checked)
                    j = 2;
                    break;

            case R.id.barreirasAltas:
                if(checked)
                    j = 3;
                    break;

            case R.id.maisSeco:
                if(checked)
                    j = 4;
                    break;

            case R.id.tamRN:
                if(checked)
                    k = 1;
                    break;

            case R.id.tamP:
                if(checked)
                    k = 2;
                    break;

            case R.id.tamM:
                if(checked)
                    k = 3;
                    break;

            case R.id.tamG:
                if(checked)
                    k = 4;
                    break;

            case R.id.tamXG:
                if(checked)
                    k = 5;
                    break;

            case R.id.tamXXG:
                if(checked)
                    k = 6;
                    break;


        }



            if (j == 1 && k == 1){
                resultadoFinalHuggiesFralda = "O produto mais recomendado é Soft Touch primeiros 100 dias RN";

            }else{

                if (j == 1 && k == 2){
                    resultadoFinalHuggiesFralda = "O produto mais recomendado é Soft Touch primeiros 100 dias P";

                }else{

                    if (j == 1 && k == 3){
                        resultadoFinalHuggiesFralda = "O produto mais recomendado é Soft Touch com roupinha M";

                    }else{

                        if (j == 1 && k == 4){
                            resultadoFinalHuggiesFralda = "O produto mais recomendado é  Soft Touch com roupinha G";

                        }else{

                            if (j == 1 && k == 5){
                                resultadoFinalHuggiesFralda = "O produto mais recomendado é  Soft Touch com roupinha XG/XXG";

                            }else{

                                if (j == 1 && k == 6){
                                    resultadoFinalHuggiesFralda = "O produto mais recomendado é  Soft Touch com roupinha XG/XXG";

                                }else{

                                if (j == 2 && k == 1){
                                    resultadoFinalHuggiesFralda = "Não há produto recomendado para estas seleções, tente um tamanho maior";

                                }else{

                                    if (j == 2 && k == 2){
                                        resultadoFinalHuggiesFralda = "O produto mais recomendado é Little Swimmers P";

                                    }else{

                                        if (j == 2 && k == 3){
                                            resultadoFinalHuggiesFralda = "O produto mais recomendado é Little Swimmers M";

                                        }else{

                                            if (j == 2 && k == 4){
                                                resultadoFinalHuggiesFralda = "O produto mais recomendado é Little Swimmers G";

                                            }else{

                                                if (j == 2 && k == 5){
                                                    resultadoFinalHuggiesFralda = "Não há produto recomendado para estas seleções, tente um tamanho menor";

                                                }else{

                                                    if (j == 2 && k == 6){
                                                        resultadoFinalHuggiesFralda = "Não há produto recomendado para estas seleções, tente um tamanho menor";

                                                    }else{

                                                        if (j == 3 && k == 1){
                                                            resultadoFinalHuggiesFralda = "Não há produto recomendado para estas seleções, tente um tamanho maior";

                                                        }else{

                                                            if (j == 3 && k == 2){
                                                                resultadoFinalHuggiesFralda = "O produto mais recomendado é Tripla Proteção P";

                                                            }else{

                                                                if (j == 3 && k == 3){
                                                                    resultadoFinalHuggiesFralda = "O produto mais recomendado é Tripla Proteção M, também disponível no modelo de roupinha";

                                                                }else{

                                                                    if (j == 3 && k == 4){
                                                                        resultadoFinalHuggiesFralda = "O produto mais recomendado é Tripla Proteção G, também disponível no modelo de roupinha";

                                                                    }else{

                                                                        if (j == 3 && k == 5){
                                                                            resultadoFinalHuggiesFralda = "O produto mais recomendado é Tripla Proteção XG, também disponível no modelo de roupinha XG/XXG";

                                                                        }else{

                                                                            if (j == 3 && k == 6){
                                                                                resultadoFinalHuggiesFralda = "O produto mais recomendado é Tripla Proteção XXG, também disponível no modelo de roupinha XG/XXG";

                                                                            }else{

                                                                                if (j == 4 && k == 1){
                                                                                    resultadoFinalHuggiesFralda = "Não há produto recomendado para estas seleções, tente um tamanho maior";

                                                                                }else{

                                                                                    if (j == 4 && k == 2){
                                                                                        resultadoFinalHuggiesFralda = "O produto mais recomendado é Supreme Care P";

                                                                                    }else{

                                                                                        if (j == 4 && k == 3){
                                                                                            resultadoFinalHuggiesFralda = "O produto mais recomendado éSupreme Care M ";

                                                                                        }else{

                                                                                            if (j == 4 && k == 4){
                                                                                                resultadoFinalHuggiesFralda = "O produto mais recomendado é Supreme Care G";

                                                                                            }else{

                                                                                                if (j == 4 && k == 5){
                                                                                                    resultadoFinalHuggiesFralda = "O produto mais recomendado é Supreme Care XG";

                                                                                                }else{

                                                                                                    if (j == 4 && k == 6){
                                                                                                        resultadoFinalHuggiesFralda = "O produto mais recomendado é Supreme Care XXG";


                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

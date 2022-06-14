package com.example.guiab.nac1q3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtTitulo;
    private EditText edtConteudo;
    private final String DICIONARIO = "NOTAS";
    private final String NOT_FOUND = " ~~~ NOTA NÃO ENCONTRADA ~~~ ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAdicionarNota(View view)
    {

        edtTitulo = (EditText) findViewById(R.id.edtTitulo);
        edtConteudo = (EditText) findViewById(R.id.edtConteudo);


        String titulo = edtTitulo.getText().toString();
        String conteudo = edtConteudo.getText().toString();


        SharedPreferences sh = getSharedPreferences(DICIONARIO, Context.MODE_PRIVATE);
        SharedPreferences.Editor ed = sh.edit();


        ed.putString(titulo, conteudo);

        ed.apply();

        edtTitulo.setText("");
        edtConteudo.setText("");

        Toast.makeText(this, "Nota (" + titulo + ") foi adicionada", Toast.LENGTH_LONG).show();
    }

    public void doBuscarNota(View view)
    {

        edtTitulo = (EditText) findViewById(R.id.edtTitulo);
        edtConteudo = (EditText) findViewById(R.id.edtConteudo);


        String titulo = edtTitulo.getText().toString();


        SharedPreferences sh = getSharedPreferences(DICIONARIO, Context.MODE_PRIVATE);


        String conteudo = sh.getString(titulo, NOT_FOUND);

        if(conteudo == NOT_FOUND)
        {

            Toast.makeText(this, "Desculpe, não encontramos nenhuma nota com título " + titulo, Toast.LENGTH_LONG).show();
        }
        else
        {

            edtConteudo.setText(conteudo);
        }
    }
}

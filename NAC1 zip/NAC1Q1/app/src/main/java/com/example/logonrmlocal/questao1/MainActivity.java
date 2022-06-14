package com.example.logonrmlocal.questao1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

//import org.json.JSONException;
//import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doPesquisar(View view){

        String url = "https://jsonplaceholder.typicode.com/todos/";

        EditText edtId = findViewById(R.id.edtId);
        url += edtId.getText().toString();

        TextView txtTitle = findViewById(R.id.txtTitle);
        TextView txtCompleted = findViewById(R.id.txtCompleted);

        new DataGetter(txtTitle,txtCompleted).execute(url);


        edtId.selectAll();
    }
}

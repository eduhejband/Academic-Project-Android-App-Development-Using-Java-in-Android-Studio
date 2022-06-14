package com.example.guiab.nac1q2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSubmeter(View view){

        String url = "https://jsonplaceholder.typicode.com/posts";

        String parameter =
                "{\n                                   " +
                        "   \"userId\":   UserId_Value,\n  " +
                        "   \"title\" : \"Title_Value\"\n  " +
                        "   \"body\"  : \"Body_Value\"\n   " +
                        "}                                     ";

        TextView edtUserId = findViewById(R.id.edtUserId);
        TextView edtTitle = findViewById(R.id.edtTitle);
        TextView edtBody = findViewById(R.id.edtBody);
        TextView txtFeedback = findViewById(R.id.txtFeedback);

        parameter.replace( "UserId_Value" , edtUserId.getText().toString() );
        parameter.replace( "Title_Value" , edtTitle.getText().toString() );
        parameter.replace( "Body_Value" , edtBody.getText().toString() );

        new DataGetterPost(txtFeedback).execute(url,parameter);
    }
}

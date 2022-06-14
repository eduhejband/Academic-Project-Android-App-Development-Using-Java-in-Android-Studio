package com.example.guiab.nac1q2;

import android.os.AsyncTask;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class DataGetterPost extends AsyncTask<String,Void,String> {


    private TextView txtFeedback;

    public DataGetterPost(TextView txtFeedback) {
        this.txtFeedback = txtFeedback;
    }

    @Override
    protected String doInBackground(String... strings) {

        return NetworkToolkit.doPost(strings[0],strings[1]);
    }

    @Override
    protected void onPostExecute(String s) {
        try
        {
            JSONObject jsonResponse = new JSONObject(s);

            String id = jsonResponse.getString("id");

            txtFeedback.setText("Sucesso! ID: " + id);
        }
        catch(JSONException e){
            this.txtFeedback.setText(e.toString());
        }
    }
}

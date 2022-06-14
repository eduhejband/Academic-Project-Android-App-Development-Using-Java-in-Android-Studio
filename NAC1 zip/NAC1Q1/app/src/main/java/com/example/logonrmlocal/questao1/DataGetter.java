package com.example.logonrmlocal.questao1;

//import android.content.Context;
import android.os.AsyncTask;
//import android.util.Log;
import android.widget.TextView;
//import android.widget.Toast;

//import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DataGetter extends AsyncTask<String,Void,String> {

    private TextView txtTitle;
        private TextView txtCompleted;

    public DataGetter(TextView txtTitle, TextView txtCompleted) {
        this.txtTitle = txtTitle;
        this.txtCompleted = txtCompleted;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected String doInBackground(String... strings) {

        String url = strings[0];
        String result = NetworkToolkit.doGet(url);

        return result;
    }

    @Override
    protected void onPostExecute(String s) {

        try
        {

            JSONObject jsonObject = new JSONObject(s);

            String title = jsonObject.getString("title");
            boolean completed = jsonObject.getBoolean("completed");


            txtTitle.setText(title);
            txtCompleted.setText(String.valueOf(completed));

        }
        catch(JSONException e){
            this.txtTitle.setText(e.toString());
        }
    }
}


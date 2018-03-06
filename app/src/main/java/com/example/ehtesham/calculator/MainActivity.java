package com.example.ehtesham.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public EditText e1,e2;
    public Button b1;
    private Contacts contacts;
    private ApiInterface apiInterface;
    public String s1,s2;
    public TokenRequest tokenRequest = new TokenRequest();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        e1 = (EditText) findViewById(R.id.editText3);
        e2 = (EditText) findViewById(R.id.editText4);
        b1 = (Button) findViewById(R.id.button);
        s1 = e1.getText().toString().trim();
        s2 = e2.getText().toString().trim();
        tokenRequest.setPwd(s2);
        tokenRequest.setUser(s1);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
                Call<Contacts> call = apiInterface.getContacts(tokenRequest);
                /*Gson gson = new GsonBuilder()
                        .setLenient()
                        .create();*/


                call.enqueue(new Callback<Contacts>() {
                    @Override
                    public void onResponse(Call<Contacts> call, Response<Contacts> response) {
                        //contacts = response.body();
                        Toast.makeText(MainActivity.this,""+response,Toast.LENGTH_LONG).show();

                        Intent i = new Intent(MainActivity.this,NextActivity.class);
                        startActivity(i);

                    }

                    @Override
                    public void onFailure(Call<Contacts> call, Throwable t) {
                        Log.d("hi",""+t);
                        Toast.makeText(MainActivity.this,""+t,Toast.LENGTH_LONG).show();


                    }
                });

            }
        });




    }

}



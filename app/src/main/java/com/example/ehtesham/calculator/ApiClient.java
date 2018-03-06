package com.example.ehtesham.calculator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ehtesham on 6/3/18.
 */

public class ApiClient {

    public static final String url = "http://8b8151a6.ngrok.io/api/login/";
    public static Retrofit retrofit = null;
    static Gson gson = new GsonBuilder()
            .setLenient()
            .create();


    public static Retrofit getApiClient()
    {
        if(retrofit==null)
        {
            retrofit = new Retrofit.Builder().baseUrl(url).
                    addConverterFactory(GsonConverterFactory.create(gson)).build();
        }
        return retrofit;

    }
}

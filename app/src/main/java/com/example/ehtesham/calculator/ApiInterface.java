package com.example.ehtesham.calculator;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by ehtesham on 6/3/18.
 */

public interface ApiInterface {
    @POST("/api/login/")
   // Call<Contacts> getContacts(@Query("user")String user,@Query("pwd")String pwd);
    Call<Contacts> getContacts(@Body TokenRequest tokenRequest);
}

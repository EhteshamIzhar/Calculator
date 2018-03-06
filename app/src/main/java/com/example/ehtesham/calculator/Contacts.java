package com.example.ehtesham.calculator;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ehtesham on 6/3/18.
 */

public class Contacts {
    //@SerializedName("")
    private String name;


    @SerializedName("base")
    private String Email;

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return Email;
    }
}

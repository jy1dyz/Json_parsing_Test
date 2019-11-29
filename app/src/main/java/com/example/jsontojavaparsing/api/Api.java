package com.example.jsontojavaparsing.api;

import com.example.jsontojavaparsing.model.MyPojo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("index.php?filename=cashBoxAnalyse.json")
    Call<List<MyPojo>> getJson();

}
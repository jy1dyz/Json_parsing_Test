package com.example.jsontojavaparsing.api;

import com.example.jsontojavaparsing.model.Data;
import com.example.jsontojavaparsing.model.Field;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiForObject {

   /* @GET("cashBoxAnalyse.json")
    Call<Data> getJsonObject(); */

    @GET("cashBoxAnalyse.json")
    Call<Field> getJsonObject();
    Call<List<Data>> getJsonArray();

}

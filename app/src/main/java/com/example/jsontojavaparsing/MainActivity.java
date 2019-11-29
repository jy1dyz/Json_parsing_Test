package com.example.jsontojavaparsing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jsontojavaparsing.api.Api;
import com.example.jsontojavaparsing.api.RetrofitClientInstance;
import com.example.jsontojavaparsing.model.Data;
import com.example.jsontojavaparsing.model.MyPojo;
import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ScrollView scrollView;
    TextView datetime, direction, method, scalar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = new ScrollView(this);
        datetime = findViewById(R.id.datetime);
        direction = findViewById(R.id.direction);
        method = findViewById(R.id.method);
        scalar = findViewById(R.id.scalar);

        getJson();
       // getJsonObject();
    }

    public void getJson() {
        final Api request = RetrofitClientInstance.getRetrofitInstance().create(Api.class);
        Call<List<MyPojo>> call = request.getJson();
        Log.i("autolog", "Call<List<MyPojo>> call = request.getJson();");

        call.enqueue(new Callback<List<MyPojo>>() {
            @Override
            public void onResponse(Call<List<MyPojo>> call, Response<List<MyPojo>> response) {

                if(response.isSuccessful()) {
                    List<MyPojo> body = response.body();

                    Type listType = new TypeToken<List<Data>>() {}.getType();

                    Log.e("TAG", body.toString() + "");
                    Log.e("TAG", body.get(0).toString() + "");
                    Log.e("TAG", body.getClass().toString() + "");
                    Toast.makeText(MainActivity.this, "parsing json array successfully", Toast.LENGTH_LONG).show();

                    datetime.setText(body.get(0).toString());
                    direction.setText(body.get(1).toString());
                    method.setText(body.toString());
                }

            }

            @Override
            public void onFailure(Call<List<MyPojo>> call, Throwable t) {
                Log.d("Error",t.getMessage());
            }
        });
    }

    /* public void getJsonObject() {
        final ApiForObject request = RetrofitClientInstance.getRetrofitInstance().create(ApiForObject.class);
        Call<Field> call = request.getJsonObject();
        call.enqueue(new Callback<Field>() {
            @Override
            public void onResponse(Call<Field> call, Response<Field> response) {

                if(response.isSuccessful()) {

                    //assert response.body() != null;
                    Log.e("TAG", response.body().getTitle());
                    Log.e("TAG", response.body().getName());
                    Toast.makeText(MainActivity.this, "parsing json array successfully", Toast.LENGTH_LONG).show();

                    datetime.setText(response.body().getName());
                    datetime.setText(response.body().getTitle());

                }

            }

            @Override
            public void onFailure(Call<Field> call, Throwable t) {
                Log.d("Error",t.getMessage());
            }
        });
    } */
}

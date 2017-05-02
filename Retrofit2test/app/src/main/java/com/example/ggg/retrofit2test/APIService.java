package com.example.ggg.retrofit2test;

import android.provider.Contacts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;


/**
 * Created by GGG on 2/5/2560.
 */

public interface APIService {
    @GET("/feeds/flowers.json")
    Call<List<Products>> getPeopleDetails();

    @FormUrlEncoded
    @POST("my_json/insertUsingRetrofit.php")
    Call<Products> setPeopleDetails(@Field("name") String name);
}

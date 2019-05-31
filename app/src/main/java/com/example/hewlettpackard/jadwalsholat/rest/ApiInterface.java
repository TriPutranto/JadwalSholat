package com.example.hewlettpackard.jadwalsholat.rest;

import com.example.hewlettpackard.jadwalsholat.model.Items;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

//Interface Link Endpoint

public interface ApiInterface {
    @GET("jakarta/daily.json")
    Call<Items> getJadwalSholat(@Query("jakarta") String jakarta);
}

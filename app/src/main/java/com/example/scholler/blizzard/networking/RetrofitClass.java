package com.example.scholler.blizzard.networking;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.example.scholler.blizzard.Events.OnJsonResponseListener;
import com.example.scholler.blizzard.MainActivity;
import com.example.scholler.blizzard.Model.JsonResponseModel;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClass extends MainActivity {

    private final static String BaseURL = "https://eu.api.battle.net/wow/";
    private final static String ApiKEY  = "6jnxpjv5duhynpajsjxb4tgueukm7jk4";
    private final OnJsonResponseListener listener;




    public RetrofitClass(OnJsonResponseListener listener) {
        this.listener = listener;
    }



    public void sendApiRequestPvP(String realm, String characterName) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BaseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        InterfaceAPI interfaceAPI = retrofit.create(InterfaceAPI.class);

        Call<JsonResponseModel.Scan> call = interfaceAPI.pvpResponse(realm, characterName);


        call.enqueue(new Callback<JsonResponseModel.Scan>() {
            @Override
            public void onResponse(Call<JsonResponseModel.Scan> call, Response<JsonResponseModel.Scan> response) {

                  listener.onSuccess(response.body());

            }

            @Override
            public void onFailure(Call<JsonResponseModel.Scan> call, Throwable t) {

                listener.onError(t);

            }
        });
    }

    public void sendApiRequestProfile(String realm, String characterName) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BaseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        InterfaceAPI interfaceAPI = retrofit.create(InterfaceAPI.class);

        Call<JsonResponseModel.Scan> call = interfaceAPI.characterProfile(realm, characterName);


        call.enqueue(new Callback<JsonResponseModel.Scan>() {
            @Override
            public void onResponse(Call<JsonResponseModel.Scan> call, Response<JsonResponseModel.Scan> response) {

                listener.onSuccess(response.body());

            }

            @Override
            public void onFailure(Call<JsonResponseModel.Scan> call, Throwable t) {

                listener.onError(t);

            }
        });
    }

    public void sendApiRequestTitles(String realm, String characterName) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BaseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        InterfaceAPI interfaceAPI = retrofit.create(InterfaceAPI.class);

        Call<JsonResponseModel.Scan> call = interfaceAPI.pvpResponse(realm, characterName);


        call.enqueue(new Callback<JsonResponseModel.Scan>() {
            @Override
            public void onResponse(Call<JsonResponseModel.Scan> call, Response<JsonResponseModel.Scan> response) {

                listener.onSuccess(response.body());

            }

            @Override
            public void onFailure(Call<JsonResponseModel.Scan> call, Throwable t) {

                listener.onError(t);

            }
        });
    }

    public void sendApiRequestLeaderboard() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BaseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        InterfaceAPI interfaceAPI = retrofit.create(InterfaceAPI.class);

        Call<JsonResponseModel.Scan> call = interfaceAPI.pvpLeaderboard();


        call.enqueue(new Callback<JsonResponseModel.Scan>() {
            @Override
            public void onResponse(Call<JsonResponseModel.Scan> call, Response<JsonResponseModel.Scan> response) {

                listener.onSuccess(response.body());

            }

            @Override
            public void onFailure(Call<JsonResponseModel.Scan> call, Throwable t) {

                listener.onError(t);

            }
        });
    }
}



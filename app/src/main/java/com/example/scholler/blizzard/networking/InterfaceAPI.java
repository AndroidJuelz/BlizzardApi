package com.example.scholler.blizzard.networking;


import com.example.scholler.blizzard.Model.JsonResponseModel;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface InterfaceAPI {

    //Note that JsonResponseModel.Scan has access to all inner attributes

    @GET("character/{realm}/{characterName}?fields=pvp&locale=de_DE&apikey=6jnxpjv5duhynpajsjxb4tgueukm7jk4")
    Call<JsonResponseModel.Scan> pvpResponse(@Path("realm") String realm,
                                             @Path("characterName") String characterName);

    @GET("character/{realm}/{characterName}?locale=de_DE&apikey=6jnxpjv5duhynpajsjxb4tgueukm7jk4")
    Call<JsonResponseModel.Scan> characterProfile(@Path("realm") String realm,
                                                  @Path("characterName") String characterName);

    @GET("character/{realm}/{characterName}?fields=titles&locale=de_DE&apikey=6jnxpjv5duhynpajsjxb4tgueukm7jk4")
    Call<JsonResponseModel.Scan> getTitles(@Path("realm") String realm,
                                           @Path("characterName") String characterName);

    @GET("leaderboard/{bracket}?locale=de_DE&apikey=6jnxpjv5duhynpajsjxb4tgueukm7jk4")
    Call<JsonResponseModel.Scan> pvpLeaderboard(@Path("bracket") String bracket);










}

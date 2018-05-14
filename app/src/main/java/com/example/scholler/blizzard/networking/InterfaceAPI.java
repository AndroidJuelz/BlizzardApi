package com.example.scholler.blizzard.networking;


import com.example.scholler.blizzard.Model.JsonResponseLeaderboard;
import com.example.scholler.blizzard.Model.JsonResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface InterfaceAPI {

    //Note that JsonResponseModel.Scan has access to all inner attributes

    @GET("character/{realm}/{characterName}?fields=pvp&locale=de_DE&apikey=6jnxpjv5duhynpajsjxb4tgueukm7jk4")
    Call<JsonResponseModel.Scan> pvpResponse(@Path("realm") String realm,
                                             @Path("characterName") String characterName);

    @GET("character/{realm}/{characterName}?locale=de_DE&apikey=6jnxpjv5duhynpajsjxb4tgueukm7jk4")
    Call<JsonResponseModel.Scan> characterProfile(@Path("realm") String realm,
                                                  @Path("characterName") String characterName);

    //@GET("character/{realm}/{characterName}?fields=titles&locale=de_DE&apikey=6jnxpjv5duhynpajsjxb4tgueukm7jk4")
    @GET("character/{realm}/{characterName}?fields=titles&locale=de_DE&apikey=6jnxpjv5duhynpajsjxb4tgueukm7jk4")
    Call<JsonResponseModel.Scan> characterTitles(@Path("realm") String realm,
                                                 @Path("characterName") String characterName);

    @GET("leaderboard/3v3?locale=de_DE&apikey=6jnxpjv5duhynpajsjxb4tgueukm7jk4")
    Call<JsonResponseLeaderboard.Scan> pvpLeaderboard();






}

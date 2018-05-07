package com.example.scholler.blizzard.Events;


import com.example.scholler.blizzard.Model.JsonResponseLeaderboard;
import com.example.scholler.blizzard.Model.JsonResponseModel;

public interface OnJsonResponseListener {

    void onSuccess(JsonResponseModel.Scan jsonResponseModel);

    void onSuccess2(JsonResponseLeaderboard.Scan jsonleaderboard);

    void onError(Throwable throwable);


}

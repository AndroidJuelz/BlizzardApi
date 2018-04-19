package com.example.scholler.blizzard.Events;


import com.example.scholler.blizzard.Model.JsonResponseModel;

public interface OnJsonResponseListener {

    void onSuccess(JsonResponseModel.Scan jsonResponseModel);

    void onError(Throwable throwable);
}

package com.example.scholler.blizzard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.scholler.blizzard.Model.JsonResponseModel;

import java.io.Serializable;
import java.util.List;

import butterknife.ButterKnife;

public class ActivityCharacterTitles extends AppCompatActivity implements Serializable {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_titles);
        ButterKnife.bind(this);


        //ToDo: needs to be finished


    }
}

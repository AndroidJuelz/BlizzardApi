package com.example.scholler.blizzard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityCharacterTitles extends AppCompatActivity implements Serializable {

    @BindView(R.id.imageViewTitles)
    ImageView imageView;

    @BindView(R.id.textViewSelected)
    TextView textViewSelected;

    @BindView(R.id.textViewTitleList)
    TextView textViewTitleList;

    @BindView(R.id.textViewCharNameTitle)
    TextView textViewName;

    private ArrayList<String> receivedTitles;

    private String characterName;
    private String selectedTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_titles);
        ButterKnife.bind(this);

        textViewTitleList.setText("");

        if (getIntent().getExtras() != null) {

            String URL = getIntent().getStringExtra("thumbnail");
            String baseUrl = "http://render-eu.worldofwarcraft.com/character/";
            Picasso.get().load(baseUrl + URL).into(imageView);


            receivedTitles = getIntent().getExtras().getStringArrayList("titles");
            selectedTitle  = getIntent().getStringExtra("selectedtitle");

        }

        characterName = getIntent().getStringExtra("charactername");

        //ToDo: Find out how to correctly get the selected title, atm its only displaying the first(0)st title in the list
        textViewName.setText(characterName);

        textViewSelected.setText(selectedTitle.replace("%s", ""));


        //fills the title textview and replaces unwanted string parts
        for (int i = 0; i < receivedTitles.size(); i++) {
            textViewTitleList.append(receivedTitles.get(i)
                    .replace("%s", "")
                    .replace(",", ""));
            textViewTitleList.append("\n" + "\n");
        }

        Log.d("length", String.valueOf(receivedTitles.size()));
        Log.d("receivedtitles", receivedTitles.toString());


    }

}

package com.example.scholler.blizzard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_titles);
        ButterKnife.bind(this);

        receivedTitles = null;

        if(getIntent().getExtras() != null) {

            String URL = getIntent().getStringExtra("thumbnail");
            String baseUrl = "http://render-eu.worldofwarcraft.com/character/";
            Picasso.get().load(baseUrl+URL).into(imageView);

            receivedTitles = getIntent().getExtras().getStringArrayList("titles");

        }


        characterName = getIntent().getStringExtra("charactername");

        textViewName.setText(characterName);

        textViewSelected.setText(receivedTitles.get(0)
                .replace("%s", ""));

        //ToDo: There seems to be a bug with the length of receivedTitles
        //ToDo: Sometimes the length increases to more than it should
        //ToDo: Seems to happen when you go back in the activity which will cause the old and the new titles to be loaded
        for(int i = 0; i < receivedTitles.size(); i++) {
            textViewTitleList.append(receivedTitles.get(i)
                    .replace("%s", "")
                    .replace(",", ""));
            textViewTitleList.append("\n" + "\n");
        }

        Log.d("length", String.valueOf(receivedTitles.size()));
        Log.d("receivedtitles", receivedTitles.toString());



    }

    //Trying to fix the problem with the additional titles by setting received titles null(not working so far)
    protected void onStop() {
        super.onStop();
        receivedTitles = null;
    }

    protected void onResume() {
        super.onResume();
        receivedTitles = null;
    }
}

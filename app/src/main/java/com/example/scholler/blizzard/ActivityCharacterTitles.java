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

    ArrayList<String> receivedTitles;

    String titleString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_titles);
        ButterKnife.bind(this);


        if(getIntent().getExtras() != null) {

            String URL = getIntent().getStringExtra("thumbnail");
            String baseUrl = "http://render-eu.worldofwarcraft.com/character/";
            Log.d("testpic", URL);
            Picasso.get().load(baseUrl+URL).into(imageView);


            receivedTitles = getIntent().getExtras().getStringArrayList("titles");


        }

        textViewSelected.setText(receivedTitles.get(0)
                .replace("%s", ""));

        for(int i = 0; i < receivedTitles.size(); i++) {
            textViewTitleList.append(receivedTitles.get(i)
                    .replace("%s", "")
                    .replace(",", ""));
            textViewTitleList.append("\n");
        }



    }


}

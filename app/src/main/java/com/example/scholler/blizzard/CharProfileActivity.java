package com.example.scholler.blizzard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CharProfileActivity extends AppCompatActivity {


    @BindView(R.id.textViewNameProfile)
    TextView textViewName;

    @BindView(R.id.textViewRealmProfile)
    TextView textViewRealm;

    @BindView(R.id.textViewAcvPoints)
    TextView textViewAcvPoints;

    @BindView(R.id.imageViewMenu2)
    ImageView imageViewMenu2;

    @BindView(R.id.textViewClass)
    TextView textViewClass;

    @BindView(R.id.textViewRace)
    TextView textViewRace;

    @BindView(R.id.imageViewCharacter)
    ImageView imageViewChar;

    protected String characterName;
    protected String realm;
    protected int _class;
    protected int race;
    private String raceString;
    private String classString;
    private String imageUrl2;
    private String imageUrl1;
    private String URL;
    protected int acvPoints;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_profile);
        ButterKnife.bind(this);

            RaceChecker raceChecker = new RaceChecker();
            ClassChecker classChecker = new ClassChecker();

            characterName = getIntent().getStringExtra("characterName");
            realm         = getIntent().getStringExtra("realm");
            acvPoints     = getIntent().getIntExtra("acvpoints", 0);
            _class        = getIntent().getIntExtra("class", 0);
            race          = getIntent().getIntExtra("race", 0);
            imageUrl1     = "http://render-eu.worldofwarcraft.com/character/";
            imageUrl2      = getIntent().getStringExtra("thumbnail");
            URL = imageUrl1 + imageUrl2;


            raceString = raceChecker.checkForRace(race);
            classString = classChecker.checkForClass(_class);

            Picasso.get().load(imageUrl1+imageUrl2).into(imageViewChar);
            Log.d("thumbn", imageUrl1+imageUrl2);

            textViewName.setText(characterName);
            textViewRealm.setText(realm);
            textViewAcvPoints.setText(String.valueOf(acvPoints));
            textViewClass.setText(String.valueOf(classString));
            textViewRace.setText(String.valueOf(raceString));


    }

    @OnClick(R.id.imageViewMenu2)
    protected void openActivitySelect() {
        Intent i = new Intent(getApplicationContext(), ActivitySelectTopic.class);
        startActivity(i);
    }

}

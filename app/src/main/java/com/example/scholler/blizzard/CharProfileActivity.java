package com.example.scholler.blizzard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

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

    protected String characterName;
    protected String realm;
    protected int _class;
    protected int race;
    private String raceString;
    private String classString;
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

        raceString = raceChecker.checkForRace(race);
        classString = classChecker.checkForClass(_class);


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

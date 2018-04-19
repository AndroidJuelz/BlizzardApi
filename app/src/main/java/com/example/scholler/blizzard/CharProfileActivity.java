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

    protected String characterName;
    protected String realm;
    protected int acvPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_profile);
        ButterKnife.bind(this);

        characterName = getIntent().getStringExtra("characterName");
        realm         = getIntent().getStringExtra("realm");
        acvPoints     = getIntent().getIntExtra("acvpoints", 0);

        textViewName.setText(characterName);
        textViewRealm.setText(realm);
        textViewAcvPoints.setText(String.valueOf(acvPoints));


    }

    @OnClick(R.id.imageViewMenu2)
    protected void openActivitySelect() {
        Intent i = new Intent(getApplicationContext(), ActivitySelectTopic.class);
        startActivity(i);
    }
}

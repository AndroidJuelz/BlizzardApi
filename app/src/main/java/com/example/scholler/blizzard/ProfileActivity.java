package com.example.scholler.blizzard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.scholler.blizzard.Events.OnJsonResponseListener;
import com.example.scholler.blizzard.Model.JsonResponseLeaderboard;
import com.example.scholler.blizzard.Model.JsonResponseModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProfileActivity extends AppCompatActivity implements OnJsonResponseListener {


    @BindView(R.id.textViewName)
    TextView textViewName;

    @BindView(R.id.textViewRating2)
    TextView textViewRating2v2;

    @BindView(R.id.textViewRating3)
    TextView textViewRating3v3;

    @BindView(R.id.textViewServer)
    TextView textViewServer;

    @BindView(R.id.imageViewMenu)
    ImageView imageView;

    @BindView(R.id.textViewGamesPlayed2s)
    TextView textViewPlayed2s;

    @BindView(R.id.textViewGamesWon2s)
    TextView textViewWon2s;

    @BindView(R.id.textViewGamesPlayed3s)
    TextView textViewPlayed3s;

    @BindView(R.id.textViewGamesWon3s)
    TextView textViewWon3s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);

        String realm = getIntent().getStringExtra("realm");
        String characterName = getIntent().getStringExtra("characterName");

        int rating2v2 = getIntent().getIntExtra("rating2v2", 0);
        int rating3v3 = getIntent().getIntExtra("rating3v3", 0);

        int gamesPlayed2s = getIntent().getIntExtra("played2s", 0);
        int gamesWon2s    = getIntent().getIntExtra("won2s", 0);

        int gamesPlayed3s = getIntent().getIntExtra("played3s", 0);
        int gamesWon3s    = getIntent().getIntExtra("won3s", 0);



        if(textViewName != null || textViewRating2v2 != null || textViewRating3v3 != null || textViewServer != null) {

            textViewName.setText(characterName);
            textViewRating2v2.setText(String.valueOf(rating2v2));
            textViewRating3v3.setText(String.valueOf(rating3v3));
            textViewServer.setText(realm);
            textViewPlayed2s.setText(String.valueOf(gamesPlayed2s));
            textViewWon2s.setText(String.valueOf(gamesWon2s));
            textViewPlayed3s.setText(String.valueOf(gamesPlayed3s));
            textViewWon3s.setText(String.valueOf(gamesWon3s));

        } else {
            Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_LONG).show();
        }


    }

    @Override
    public void onSuccess(JsonResponseModel.Scan jsonResponseModel) {

    }

    @Override
    public void onSuccess2(JsonResponseLeaderboard.Scan jsonleaderboard) {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @OnClick(R.id.imageViewMenu)
    protected void openActivitySelect() {
        Intent i = new Intent(getApplicationContext(), ActivitySelectTopic.class);
        startActivity(i);
    }
}

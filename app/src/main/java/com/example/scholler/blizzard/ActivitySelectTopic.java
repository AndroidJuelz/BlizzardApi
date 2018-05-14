package com.example.scholler.blizzard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivitySelectTopic extends AppCompatActivity {


    @BindView(R.id.textViewHomepage)
    TextView textViewHomePage;

    @BindView(R.id.textViewCutoffs)
    TextView textViewCutoffs;

    @BindView(R.id.textViewMainMenu)
    TextView textViewMainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_topic);
        ButterKnife.bind(this);

        textViewHomePage.setMovementMethod(LinkMovementMethod.getInstance());


    }

    @OnClick({R.id.textViewMainMenu, R.id.textViewCutoffs})
    protected void OnClickSelectMenu(View view) {
        switch(view.getId()) {

            case R.id.textViewHomepage:
                //opens Blizzards homepage(link added in string value)
                break;
            case R.id.textViewCutoffs:
                Intent i = new Intent(getApplicationContext(), TitleCutoffsActivity.class);
                startActivity(i);
                break;
            case R.id.textViewMainMenu:
                Intent i2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i2);
        }
    }

}

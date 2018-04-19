package com.example.scholler.blizzard;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.scholler.blizzard.Events.OnJsonResponseListener;
import com.example.scholler.blizzard.Model.JsonResponseModel;
import com.example.scholler.blizzard.networking.RetrofitClass;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity implements OnJsonResponseListener, AdapterView.OnItemSelectedListener {


    @BindView(R.id.spinner)
    Spinner spinner;

    @BindView(R.id.editTextCharName)
    EditText editTextChar;

    @BindView(R.id.editTextRealm)
    EditText editTextRealm;

    @BindView(R.id.buttonRequest)
    Button btnRequest;

    private String characterName;
    private String realm;
    private String _class;
    private String race;
    private String faction;
    private Integer rating2v2;
    private Integer rating3v3;
    private int     charLevel;
    private int     acvPoints;
    private int gamesWon2s;
    private int gamesPlayed2s;
    private int gamesPlayed3s;
    private int gamesWon3s;

    private boolean userIsInteracting;
    private boolean edittextCheck;

    public String itemSelected;
    public int itemSelectedNum;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        spinner.setOnItemSelectedListener(this);

        //initializes the drop down menu when the activity is created
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.blizzdropdown, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }


    @OnClick(R.id.buttonRequest)
    public void whenRequestButtonIsClicked() {

        realm         = editTextRealm.getText().toString();
        characterName = editTextChar.getText().toString();


        if(realm.matches("") || characterName.matches("")) {
            Toast.makeText(getApplicationContext(), "You must not leave fields empty", Toast.LENGTH_LONG).show();
            return;
        }

        RetrofitClass retrofitClass = new RetrofitClass(this);

        //TODo: change dynamic variables in some of the methods to the required ones
        if(itemSelectedNum == 4) {

            retrofitClass.sendApiRequestPvP(realm, characterName);

        }else if(itemSelectedNum == 3) {

            retrofitClass.sendApiRequestLeaderboard(realm, characterName);

        }else if(itemSelectedNum == 2) {

            retrofitClass.sendApiRequestTitles(realm, characterName);

        }else if(itemSelectedNum == 1) {

            retrofitClass.sendApiRequestProfile(realm, characterName);

        }

    }


    @Override
    public void onSuccess(JsonResponseModel.Scan model) {


        if(model != null && itemSelectedNum == 4) {

            rating2v2 = model.pvp.brackets.aRENABRACKET2v2.getRating();
            rating3v3 = model.pvp.brackets.aRENABRACKET3v3.getRating();

            gamesPlayed2s = model.pvp.brackets.aRENABRACKET2v2.getSeasonPlayed();
            gamesWon2s    = model.pvp.brackets.aRENABRACKET2v2.getSeasonWon();

            gamesPlayed3s = model.pvp.brackets.aRENABRACKET3v3.getSeasonPlayed();
            gamesWon3s    = model.pvp.brackets.aRENABRACKET3v3.getSeasonWon();


            Log.d("ApiResponse", model.pvp.brackets.aRENABRACKET3v3.getRating().toString());
            Log.d("ApiResponse", model.pvp.brackets.aRENABRACKET2v2.getRating().toString());

            Intent i = new Intent(getApplicationContext(), ProfileActivity.class);
                i.putExtra("realm", realm);
                i.putExtra("characterName", characterName);
                i.putExtra("rating2v2", rating2v2);
                i.putExtra("rating3v3", rating3v3);
                i.putExtra("played2s", gamesPlayed2s);
                i.putExtra("won2s", gamesWon2s);
                i.putExtra("played3s", gamesPlayed3s);
                i.putExtra("won3s", gamesWon3s);
            startActivity(i);

        } else if(model != null && itemSelectedNum == 3) {

            //ToDo: This intent is for test purpose, needs to be removed later
            Intent i3 = new Intent(getApplicationContext(), TitleCutoffsActivity.class);
            startActivity(i3);

        } else if(model != null && itemSelectedNum == 2) {

        } else if(model!= null && itemSelectedNum == 1) {

            acvPoints = model.achievementPoints;

            Intent i2 = new Intent(getApplicationContext(), CharProfileActivity.class);
                i2.putExtra("realm", realm);
                i2.putExtra("characterName", characterName);
                i2.putExtra("acvpoints", acvPoints);
            startActivity(i2);

        } else {

            Toast.makeText(getApplicationContext(), "Couldn't load data. Check your inputs.", Toast.LENGTH_LONG).show();

        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        //userIsInteraction boolean blocks the instantly jumping to a new activity when MainActivity is started
        //it waits for the first userInteraction (overridden method)



        if(userIsInteracting) {

            itemSelected = adapterView.getItemAtPosition(i).toString();
            Toast.makeText(getApplicationContext(), itemSelected, Toast.LENGTH_SHORT).show();

            if(itemSelected.equals("Character Profile")) {

                itemSelectedNum = 1;
                edittextCheck = true;
                editTextChar.setEnabled(edittextCheck);
                editTextRealm.setEnabled(edittextCheck);

            } else if(itemSelected.equals("Character Titles")) {

                itemSelectedNum = 2;
                edittextCheck = true;
                editTextChar.setEnabled(edittextCheck);
                editTextRealm.setEnabled(edittextCheck);

            } else if(itemSelected.equals("PvP Leaderboard")) {

                itemSelectedNum = 3;
                edittextCheck = false;
                editTextChar.setEnabled(edittextCheck);
                editTextRealm.setEnabled(edittextCheck);

            } else if(itemSelected.equals("PvP Information")) {

                itemSelectedNum = 4;
                edittextCheck = true;
                editTextChar.setEnabled(edittextCheck);
                editTextRealm.setEnabled(edittextCheck);
            }

            if(edittextCheck) {

                editTextChar.setHint("Charactername");
                editTextRealm.setHint("Realm");

            } else {

                editTextChar.setHint("Press Request to continue");
                editTextRealm.setHint("Press Request to continue");

            }

            Log.d("itemselected", String.valueOf(itemSelectedNum));
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        userIsInteracting = true;

    }


    @Override
    public void onError(Throwable throwable) {
        Log.e("FailureApi", throwable.toString());
    }

    public EditText getEditTextChar() {
        return editTextChar;
    }

    public void setEditTextChar(EditText editTextChar) {
        this.editTextChar = editTextChar;
    }

    public EditText getEditTextRealm() {
        return editTextRealm;
    }

    public void setEditTextRealm(EditText editTextRealm) {
        this.editTextRealm = editTextRealm;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public Integer getRating2v2() {
        return rating2v2;
    }

    public Integer setRating2v2(Integer rating2v2) {
        this.rating2v2 = rating2v2;
        return rating2v2;
    }

    public int getRating3v3() {
        return rating3v3;
    }

    public int setRating3v3(int rating3v3) {
        this.rating3v3 = rating3v3;
        return rating3v3;
    }

    public int getGamesWon2s() {
        return gamesWon2s;
    }

    public void setGamesWon2s(int gamesWon2s) {
        this.gamesWon2s = gamesWon2s;
    }

    public int getGamesPlayed2s() {
        return gamesPlayed2s;
    }

    public void setGamesPlayed2s(int gamesPlayed2s) {
        this.gamesPlayed2s = gamesPlayed2s;
    }

    public int getGamesPlayed3s() {
        return gamesPlayed3s;
    }

    public void setGamesPlayed3s(int gamesPlayed3s) {
        this.gamesPlayed3s = gamesPlayed3s;
    }

    public int getGamesWon3s() {
        return gamesWon3s;
    }

    public void setGamesWon3s(int gamesWon3s) {
        this.gamesWon3s = gamesWon3s;
    }

    public int getItemSelectedNum() {
        return itemSelectedNum;
    }

    public void setItemSelectedNum(int itemSelectedNum) {
        this.itemSelectedNum = itemSelectedNum;
    }

    public int getCharLevel() {
        return charLevel;
    }

    public void setCharLevel(int charLevel) {
        this.charLevel = charLevel;
    }

    public int getAcvPoints() {
        return acvPoints;
    }

    public void setAcvPoints(int acvPoints) {
        this.acvPoints = acvPoints;
    }

}

package com.example.scholler.blizzard.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JsonResponseLeaderboard {


    @SerializedName("ranking")
    @Expose
    public Integer ranking;
    @SerializedName("rating")
    @Expose
    public Integer rating;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("realmId")
    @Expose
    public Integer realmId;
    @SerializedName("realmName")
    @Expose
    public String realmName;
    @SerializedName("realmSlug")
    @Expose
    public String realmSlug;
    @SerializedName("raceId")
    @Expose
    public Integer raceId;
    @SerializedName("classId")
    @Expose
    public Integer classId;
    @SerializedName("specId")
    @Expose
    public Integer specId;
    @SerializedName("factionId")
    @Expose
    public Integer factionId;
    @SerializedName("genderId")
    @Expose
    public Integer genderId;
    @SerializedName("seasonWins")
    @Expose
    public Integer seasonWins;
    @SerializedName("seasonLosses")
    @Expose
    public Integer seasonLosses;
    @SerializedName("weeklyWins")
    @Expose
    public Integer weeklyWins;
    @SerializedName("weeklyLosses")
    @Expose
    public Integer weeklyLosses;



    public class Scan {

        @SerializedName("rows")
        @Expose
        public List<JsonResponseLeaderboard> rows = null;

    }


}

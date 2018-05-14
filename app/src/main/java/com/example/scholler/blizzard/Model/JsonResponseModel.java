package com.example.scholler.blizzard.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JsonResponseModel {


    public static class ARENABRACKET2v2 {


        @SerializedName("slug")
        @Expose
        public String slug;
        @SerializedName("rating")
        @Expose
        public Integer rating;
        @SerializedName("weeklyPlayed")
        @Expose
        public Integer weeklyPlayed;
        @SerializedName("weeklyWon")
        @Expose
        public Integer weeklyWon;
        @SerializedName("weeklyLost")
        @Expose
        public Integer weeklyLost;
        @SerializedName("seasonPlayed")
        @Expose
        public Integer seasonPlayed;
        @SerializedName("seasonWon")
        @Expose
        public Integer seasonWon;
        @SerializedName("seasonLost")
        @Expose
        public Integer seasonLost;

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public Integer getRating() {
            return rating;
        }

        public void setRating(Integer rating) {
            this.rating = rating;
        }

        public Integer getWeeklyPlayed() {
            return weeklyPlayed;
        }

        public void setWeeklyPlayed(Integer weeklyPlayed) {
            this.weeklyPlayed = weeklyPlayed;
        }

        public Integer getWeeklyWon() {
            return weeklyWon;
        }

        public void setWeeklyWon(Integer weeklyWon) {
            this.weeklyWon = weeklyWon;
        }

        public Integer getWeeklyLost() {
            return weeklyLost;
        }

        public void setWeeklyLost(Integer weeklyLost) {
            this.weeklyLost = weeklyLost;
        }

        public Integer getSeasonPlayed() {
            return seasonPlayed;
        }

        public void setSeasonPlayed(Integer seasonPlayed) {
            this.seasonPlayed = seasonPlayed;
        }

        public Integer getSeasonWon() {
            return seasonWon;
        }

        public void setSeasonWon(Integer seasonWon) {
            this.seasonWon = seasonWon;
        }

        public Integer getSeasonLost() {
            return seasonLost;
        }

        public void setSeasonLost(Integer seasonLost) {
            this.seasonLost = seasonLost;
        }
    }


    public static class ARENABRACKET3v3 {

        @SerializedName("slug")
        @Expose
        public String slug;
        @SerializedName("rating")
        @Expose
        public Integer rating;
        @SerializedName("weeklyPlayed")
        @Expose
        public Integer weeklyPlayed;
        @SerializedName("weeklyWon")
        @Expose
        public Integer weeklyWon;
        @SerializedName("weeklyLost")
        @Expose
        public Integer weeklyLost;
        @SerializedName("seasonPlayed")
        @Expose
        public Integer seasonPlayed;
        @SerializedName("seasonWon")
        @Expose
        public Integer seasonWon;
        @SerializedName("seasonLost")
        @Expose
        public Integer seasonLost;


        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public Integer getRating() {
            return rating;
        }

        public void setRating(Integer rating) {
            this.rating = rating;
        }

        public Integer getWeeklyPlayed() {
            return weeklyPlayed;
        }

        public void setWeeklyPlayed(Integer weeklyPlayed) {
            this.weeklyPlayed = weeklyPlayed;
        }

        public Integer getWeeklyWon() {
            return weeklyWon;
        }

        public void setWeeklyWon(Integer weeklyWon) {
            this.weeklyWon = weeklyWon;
        }

        public Integer getWeeklyLost() {
            return weeklyLost;
        }

        public void setWeeklyLost(Integer weeklyLost) {
            this.weeklyLost = weeklyLost;
        }

        public Integer getSeasonPlayed() {
            return seasonPlayed;
        }

        public void setSeasonPlayed(Integer seasonPlayed) {
            this.seasonPlayed = seasonPlayed;
        }

        public Integer getSeasonWon() {
            return seasonWon;
        }

        public void setSeasonWon(Integer seasonWon) {
            this.seasonWon = seasonWon;
        }

        public Integer getSeasonLost() {
            return seasonLost;
        }

        public void setSeasonLost(Integer seasonLost) {
            this.seasonLost = seasonLost;
        }
    }


    public static class Brackets {

        @SerializedName("ARENA_BRACKET_2v2")
        @Expose
        public ARENABRACKET2v2 aRENABRACKET2v2;
        @SerializedName("ARENA_BRACKET_3v3")
        @Expose
        public ARENABRACKET3v3 aRENABRACKET3v3;


        public ARENABRACKET2v2 getaRENABRACKET2v2() {
            return aRENABRACKET2v2;
        }

        public void setaRENABRACKET2v2(ARENABRACKET2v2 aRENABRACKET2v2) {
            this.aRENABRACKET2v2 = aRENABRACKET2v2;
        }

        public ARENABRACKET3v3 getaRENABRACKET3v3() {
            return aRENABRACKET3v3;
        }

        public void setaRENABRACKET3v3(ARENABRACKET3v3 aRENABRACKET3v3) {
            this.aRENABRACKET3v3 = aRENABRACKET3v3;
        }
    }


    public static class PvP {


        @SerializedName("brackets")
        @Expose
        public Brackets brackets;

        public Brackets getBrackets() {
            return brackets;
        }

        public void setBrackets(Brackets brackets) {
            this.brackets = brackets;
        }
    }


    public static class Scan {


        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("realm")
        @Expose
        public String realm;
        @SerializedName("battlegroup")
        @Expose
        public String battlegroup;
        @SerializedName("class")
        @Expose
        public Integer _class;
        @SerializedName("race")
        @Expose
        public Integer race;
        @SerializedName("gender")
        @Expose
        public Integer gender;
        @SerializedName("level")
        @Expose
        public Integer level;
        @SerializedName("achievementPoints")
        @Expose
        public Integer achievementPoints;
        @SerializedName("thumbnail")
        @Expose
        public String thumbnail;
        @SerializedName("calcClass")
        @Expose
        public String calcClass;
        @SerializedName("faction")
        @Expose
        public Integer faction;
        @SerializedName("titles")
        @Expose
        public List<Title> titles;
        @SerializedName("pvp")
        @Expose
        public PvP pvp;
        @SerializedName("totalHonorableKills")
        @Expose
        public Integer totalHonorableKills;



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRealm() {
            return realm;
        }

        public void setRealm(String realm) {
            this.realm = realm;
        }

        public String getBattlegroup() {
            return battlegroup;
        }

        public void setBattlegroup(String battlegroup) {
            this.battlegroup = battlegroup;
        }

        public Integer get_class() {
            return _class;
        }

        public void set_class(Integer _class) {
            this._class = _class;
        }

        public Integer getRace() {
            return race;
        }

        public void setRace(Integer race) {
            this.race = race;
        }

        public Integer getGender() {
            return gender;
        }

        public void setGender(Integer gender) {
            this.gender = gender;
        }

        public Integer getLevel() {
            return level;
        }

        public void setLevel(Integer level) {
            this.level = level;
        }

        public Integer getAchievementPoints() {
            return achievementPoints;
        }

        public void setAchievementPoints(Integer achievementPoints) {
            this.achievementPoints = achievementPoints;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getCalcClass() {
            return calcClass;
        }

        public void setCalcClass(String calcClass) {
            this.calcClass = calcClass;
        }

        public Integer getFaction() {
            return faction;
        }

        public void setFaction(Integer faction) {
            this.faction = faction;
        }

        public PvP getPvp() {
            return pvp;
        }

        public void setPvp(PvP pvp) {
            this.pvp = pvp;
        }

        public Integer getTotalHonorableKills() {
            return totalHonorableKills;
        }

        public void setTotalHonorableKills(Integer totalHonorableKills) {
            this.totalHonorableKills = totalHonorableKills;
        }

        public List<Title> getTitles() {
            return titles;
        }

        public void setTitles(List<Title> titles) {
            this.titles = titles;
        }
    }


    public class Title {

        @SerializedName("id")
        @Expose
        public Integer id;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("selected")
        @Expose
        public Boolean selected;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getSelected() {
            return selected;
        }

        public void setSelected(Boolean selected) {
            this.selected = selected;
        }
    }



}


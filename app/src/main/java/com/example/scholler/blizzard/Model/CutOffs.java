package com.example.scholler.blizzard.Model;

import java.util.ArrayList;
import java.util.List;

public class CutOffs {

    private int selectedSeason;

    private int challengerCutoffA;
    private int rivalCutoffA;
    private int duelistCutoffA;
    private int gladiatorCutoffA;
    private int rankoneCutoffA;

    private int challengerCutoffH;
    private int rivalCutoffH;
    private int duelistCutoffH;
    private int gladiatorCutoffH;
    private int rankoneCutoffH;
    public List<Integer> allianceInts;
    public List<Integer> hordeInts;
    public List<String> seasons;


    public ArrayList<Integer> returnHordeRatingCutoffs() {

        ArrayList<Integer> hordeInts = new ArrayList<>();
        this.hordeInts = hordeInts;

        challengerCutoffH = 1610;
        rivalCutoffH      = 1880;
        duelistCutoffH    = 2140;
        gladiatorCutoffH  = 2610;
        rankoneCutoffH    = 2860;

        hordeInts.add(challengerCutoffH);
        hordeInts.add(rivalCutoffH);
        hordeInts.add(duelistCutoffH);
        hordeInts.add(gladiatorCutoffH);
        hordeInts.add(rankoneCutoffH);

        challengerCutoffH = 1594;
        rivalCutoffH      = 1864;
        duelistCutoffH    = 2145;
        gladiatorCutoffH  = 2597;
        rankoneCutoffH    = 2837;

        hordeInts.add(challengerCutoffH);
        hordeInts.add(rivalCutoffH);
        hordeInts.add(duelistCutoffH);
        hordeInts.add(gladiatorCutoffH);
        hordeInts.add(rankoneCutoffH);

        challengerCutoffH = 1564;
        rivalCutoffH      = 1822;
        duelistCutoffH    = 2096;
        gladiatorCutoffH  = 2559;
        rankoneCutoffH    = 2804;

        hordeInts.add(challengerCutoffH);
        hordeInts.add(rivalCutoffH);
        hordeInts.add(duelistCutoffH);
        hordeInts.add(gladiatorCutoffH);
        hordeInts.add(rankoneCutoffH);

        challengerCutoffH = 1615;
        rivalCutoffH      = 1904;
        duelistCutoffH    = 2202;
        gladiatorCutoffH  = 2712;
        rankoneCutoffH    = 2963;

        hordeInts.add(challengerCutoffH);
        hordeInts.add(rivalCutoffH);
        hordeInts.add(duelistCutoffH);
        hordeInts.add(gladiatorCutoffH);
        hordeInts.add(rankoneCutoffH);

        challengerCutoffH = 1634;
        rivalCutoffH      = 1939;
        duelistCutoffH    = 2216;
        gladiatorCutoffH  = 2674;
        rankoneCutoffH    = 2991;

        hordeInts.add(challengerCutoffH);
        hordeInts.add(rivalCutoffH);
        hordeInts.add(duelistCutoffH);
        hordeInts.add(gladiatorCutoffH);
        hordeInts.add(rankoneCutoffH);

        return hordeInts;
    }

    public ArrayList<Integer> returnAllianceRatingCutoffs() {


        ArrayList<Integer> allianceInts = new ArrayList<>();
        this.allianceInts = allianceInts;

                challengerCutoffA = 1650;
                rivalCutoffA      = 1970;
                duelistCutoffA    = 2270;
                gladiatorCutoffA  = 2740;
                rankoneCutoffA    = 2980;

                allianceInts.add(challengerCutoffA);
                allianceInts.add(rivalCutoffA);
                allianceInts.add(duelistCutoffA);
                allianceInts.add(gladiatorCutoffA);
                allianceInts.add(rankoneCutoffA);

                challengerCutoffA = 1618;
                rivalCutoffA      = 1928;
                duelistCutoffA    = 2215;
                gladiatorCutoffA  = 2701;
                rankoneCutoffA    = 2979;

                allianceInts.add(challengerCutoffA);
                allianceInts.add(rivalCutoffA);
                allianceInts.add(duelistCutoffA);
                allianceInts.add(gladiatorCutoffA);
                allianceInts.add(rankoneCutoffA);



                challengerCutoffA = 1585;
                rivalCutoffA      = 1867;
                duelistCutoffA    = 2127;
                gladiatorCutoffA  = 2571;
                rankoneCutoffA    = 2870;

                allianceInts.add(challengerCutoffA);
                allianceInts.add(rivalCutoffA);
                allianceInts.add(duelistCutoffA);
                allianceInts.add(gladiatorCutoffA);
                allianceInts.add(rankoneCutoffA);



                challengerCutoffA = 1636;
                rivalCutoffA      = 1952;
                duelistCutoffA    = 2221;
                gladiatorCutoffA  = 2689;
                rankoneCutoffA    = 2959;

                allianceInts.add(challengerCutoffA);
                allianceInts.add(rivalCutoffA);
                allianceInts.add(duelistCutoffA);
                allianceInts.add(gladiatorCutoffA);
                allianceInts.add(rankoneCutoffA);

                challengerCutoffA = 1661;
                rivalCutoffA      = 2002;
                duelistCutoffA    = 2281;
                gladiatorCutoffA  = 2779;
                rankoneCutoffA    = 3079;

                allianceInts.add(challengerCutoffA);
                allianceInts.add(rivalCutoffA);
                allianceInts.add(duelistCutoffA);
                allianceInts.add(gladiatorCutoffA);
                allianceInts.add(rankoneCutoffA);

                return allianceInts;

        }


    public ArrayList<String> returnSeasons() {


        ArrayList<String> seasons = new ArrayList<>();
        this.seasons = seasons;

        seasons.add("Season One");
        seasons.add("Season Two");
        seasons.add("Season Three");
        seasons.add("Season Four");
        seasons.add("Season Five");
        seasons.add("Season Six");

        return seasons;
        }
    }



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
    public List<Integer> ints;
    public List<String> seasons;


    public ArrayList<Integer> returnRatingFromSelectedSeason(int selectedSeason) {
        this.selectedSeason = selectedSeason;


        ArrayList<Integer> ints = new ArrayList<Integer>();
        this.ints = ints;

        /*When the ratings were initialized note that they were added
        * in another order,
        * it should be done like this lowest alliance rank rating followed
        * by lowest horde then next alliance next horde*/

        switch (selectedSeason) {
            case 1:
                gladiatorCutoffA = 2610;
                rankoneCutoffA   = 2928;
                gladiatorCutoffH = 2455;
                rankoneCutoffH   = 2754;


                ints.add(gladiatorCutoffA);
                ints.add(gladiatorCutoffH);
                ints.add(rankoneCutoffA);
                ints.add(rankoneCutoffH);
                break;

            case 2:
                challengerCutoffA = 1650;
                rivalCutoffA      = 1970;
                duelistCutoffA    = 2270;
                gladiatorCutoffA  = 2740;
                rankoneCutoffA    = 2980;

                challengerCutoffH = 1610;
                rivalCutoffH      = 1880;
                duelistCutoffH    = 2140;
                gladiatorCutoffH  = 2610;
                rankoneCutoffH    = 2860;


                ints.add(challengerCutoffA);
                ints.add(rivalCutoffA);
                ints.add(duelistCutoffA);
                ints.add(gladiatorCutoffA);
                ints.add(rankoneCutoffA);

                ints.add(challengerCutoffH);
                ints.add(rivalCutoffH);
                ints.add(duelistCutoffH);
                ints.add(gladiatorCutoffH);
                ints.add(rankoneCutoffH);
            break;

            case 3:
                challengerCutoffA = 1618;
                rivalCutoffA      = 1928;
                duelistCutoffA    = 2215;
                gladiatorCutoffA  = 2701;
                rankoneCutoffA    = 2979;

                challengerCutoffH = 1594;
                rivalCutoffH      = 1864;
                duelistCutoffH    = 2145;
                gladiatorCutoffH  = 2597;
                rankoneCutoffH    = 2837;


                ints.add(challengerCutoffA);
                ints.add(challengerCutoffH);
                ints.add(rivalCutoffA);
                ints.add(rivalCutoffH);
                ints.add(duelistCutoffA);
                ints.add(duelistCutoffH);
                ints.add(gladiatorCutoffA);
                ints.add(rankoneCutoffA);
                ints.add(gladiatorCutoffH);
                ints.add(rankoneCutoffH);
            break;

            case 4:
                challengerCutoffA = 1585;
                rivalCutoffA      = 1867;
                duelistCutoffA    = 2127;
                gladiatorCutoffA  = 2571;
                rankoneCutoffA    = 2870;

                challengerCutoffH = 1564;
                rivalCutoffH      = 1822;
                duelistCutoffH    = 2096;
                gladiatorCutoffH  = 2559;
                rankoneCutoffH    = 2804;

                ints.add(challengerCutoffA);
                ints.add(challengerCutoffH);
                ints.add(rivalCutoffA);
                ints.add(rivalCutoffH);
                ints.add(duelistCutoffA);
                ints.add(duelistCutoffH);
                ints.add(gladiatorCutoffA);
                ints.add(rankoneCutoffA);
                ints.add(gladiatorCutoffH);
                ints.add(rankoneCutoffH);
            break;

            case 5:
                challengerCutoffA = 1636;
                rivalCutoffA      = 1952;
                duelistCutoffA    = 2221;
                gladiatorCutoffA  = 2689;
                rankoneCutoffA    = 2959;

                challengerCutoffH = 1615;
                rivalCutoffH      = 1904;
                duelistCutoffH    = 2202;
                gladiatorCutoffH  = 2712;
                rankoneCutoffH    = 2963;

                ints.add(challengerCutoffA);
                ints.add(challengerCutoffH);
                ints.add(rivalCutoffA);
                ints.add(rivalCutoffH);
                ints.add(duelistCutoffA);
                ints.add(duelistCutoffH);
                ints.add(gladiatorCutoffA);
                ints.add(rankoneCutoffA);
                ints.add(gladiatorCutoffH);
                ints.add(rankoneCutoffH);
            break;

            case 6:
                challengerCutoffA = 1661;
                rivalCutoffA      = 2002;
                duelistCutoffA    = 2281;
                gladiatorCutoffA  = 2779;
                rankoneCutoffA    = 3079;

                challengerCutoffH = 1634;
                rivalCutoffH      = 1939;
                duelistCutoffH    = 2216;
                gladiatorCutoffH  = 2674;
                rankoneCutoffH    = 2991;

                ints.add(challengerCutoffA);
                ints.add(challengerCutoffH);
                ints.add(rivalCutoffA);
                ints.add(rivalCutoffH);
                ints.add(duelistCutoffA);
                ints.add(duelistCutoffH);
                ints.add(gladiatorCutoffA);
                ints.add(rankoneCutoffA);
                ints.add(gladiatorCutoffH);
                ints.add(rankoneCutoffH);

        }
        return ints;
    }

    public ArrayList<String> returnSeasons(int selectedSeason) {
        this.selectedSeason = selectedSeason;

        ArrayList<String> seasons = new ArrayList<>();
        this.seasons = seasons;

        switch (selectedSeason) {
            case 1:
                String season1 = "Season 1";
                seasons.add(season1);
                break;
            case 2:
                String season2 = "Season 2";
                seasons.add(season2);
                break;
            case 3:
                String season3 = "Season 3";
                seasons.add(season3);
                break;
            case 4:
                String season4 = "Season 4";
                seasons.add(season4);
                break;
            case 5:
                String season5 = "Season 5";
                seasons.add(season5);
                break;
            case 6:
                String season6 = "Season 6";
                seasons.add(season6);
                break;
        }
            return seasons;
    }

}

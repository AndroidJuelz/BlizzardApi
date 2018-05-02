package com.example.scholler.blizzard;

public class RaceChecker {

    int id;
    String name;

    public String checkForRace(int id) {

        if(id == 1) {
            name = "Mensch";
            return name;
        }else if(id == 2) {
            name = "Orc";
            return name;
        }else if(id == 3) {
            name = "Zwerg";
            return name;
        }else if(id == 4) {
            name = "Nachtelf";
            return name;
        }else if(id == 5) {
            name = "Untoter";
            return name;
        }else if(id == 6) {
            name = "Tauren";
            return name;
        }else if(id == 7) {
            name = "Gnom";
            return name;
        }else if(id == 8) {
            name = "Troll";
            return name;
        }else if(id == 9) {
            name = "Goblin";
            return name;
        }else if(id == 10) {
            name = "Blutelf";
            return name;
        }else if(id == 11) {
            name = "Draenei";
            return name;
        }else if(id == 22) {
            name = "Worgen";
            return name;
        }else if(id == 24) {
            name = "Pandaren";
            return name;
        }else if(id == 25) {
            name = "Pandaren";
            return name;
        }else if(id == 26) {
            name = "Pandaren";
            return name;
        }else if(id == 27) {
            name = "Nachtgeborender";
            return name;
        }else if(id == 28) {
            name = "Hochbergtauren";
            return name;
        }else if(id == 29) {
            name = "Leerenelf";
            return name;
        }else if(id == 30) {
            name = "Lichtgeschmiedeter Draenei";
            return name;
        }else {
            name = "Unknown";
            return name;
        }

    }
}

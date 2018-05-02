package com.example.scholler.blizzard;

public class ClassChecker {

    int id;
    String name;

    public String checkForClass(int id) {

        if (id == 1) {
            name = "Krieger";
            return name;
        } else if (id == 2) {
            name = "Paladin";
            return name;
        } else if (id == 3) {
            name = "Jäger";
            return name;
        } else if (id == 4) {
            name = "Schurke";
            return name;
        } else if (id == 5) {
            name = "Priester";
            return name;
        } else if (id == 6) {
            name = "Todesritter";
            return name;
        } else if (id == 7) {
            name = "Schamane";
            return name;
        } else if (id == 8) {
            name = "Magier";
            return name;
        } else if (id == 9) {
            name = "Hexenmeister";
            return name;
        } else if (id == 10) {
            name = "Mönch";
            return name;
        } else if (id == 11) {
            name = "Druide";
            return name;
        } else if (id == 12) {
            name = "Dämonenjäger";
            return name;
        } else {
            name = "Unknown";
            return name;
        }
    }
}

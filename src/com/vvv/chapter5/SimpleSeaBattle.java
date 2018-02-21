package com.vvv.chapter5;

import java.util.ArrayList;

public class SimpleSeaBattle {
    ArrayList<String> locationCells;

//    int[] locationCells;
//    int numOfHits = 0;

    public void setLocationCells(ArrayList<String> loc) {

        locationCells = loc;
         }

    public String checkYourself(String userInput) {
        String result = "Missed!";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Killed!";
            }
            else {
            result = "Hit!";
            }
        }
        System.out.println(result);
        return result;
    }
}

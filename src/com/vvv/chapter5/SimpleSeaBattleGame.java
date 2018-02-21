package com.vvv.chapter5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleSeaBattleGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        int ShipLength = 3;
        GameHelper helper = new GameHelper();
        SimpleSeaBattle ship = new SimpleSeaBattle ();
        int SizeOfSea = 7;
        int FirstCell = (int) (Math.random() * (SizeOfSea - ShipLength + 1));
        boolean isAlive = true;
        int SecondCell = FirstCell + 1;
        int ThirdCell = FirstCell + 2;

        String FirstCellString = Integer.toString(FirstCell);
        String SecondCellString = Integer.toString(SecondCell);
        String ThirdCellString = Integer.toString(ThirdCell);

        String [] locations = {FirstCellString, SecondCellString, ThirdCellString} ;
        List list = Arrays.asList(locations);
        ArrayList<String> arrayList = new ArrayList<>(list);
        ship.setLocationCells(arrayList);

        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = ship.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Killed!")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
        System.out.println(numOfGuesses);
    }
}


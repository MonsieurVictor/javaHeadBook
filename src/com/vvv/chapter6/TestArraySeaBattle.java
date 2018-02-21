package com.vvv.chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// A homework from https://www.youtube.com/watch?v=fRIrhagBCMc

public class TestArraySeaBattle {
    public static void main(String[] args) {
        int ShipLength = 3;
        int SizeOfSea = 7;
        int FirstCell = (int) (Math.random() * (SizeOfSea - ShipLength));
        int FirstCell2 = FirstCell + 1;
        int FirstCell3 = FirstCell + 2;
        int [] locations = {FirstCell, FirstCell2, FirstCell3};
        List list = Arrays.asList(locations);
        ArrayList<String> arrayList = new ArrayList<>(list);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("");
    }
}

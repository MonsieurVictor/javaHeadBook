package com.vvv.chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// A homework from https://www.youtube.com/watch?v=fRIrhagBCMc

public class TestOfArrayList {
    public static void main(String[] args) {
        String[] array = {
                "ВАЗ", "ГАЗ", "ЛАЗ", "ПАЗ", "БЕЛАЗ",
                "СЕАЗ","ЛИАЗ" , "ЛУАЗ", "ДААЗ", "КАМАЗ"};
        List list = Arrays.asList(array);
        ArrayList<String> arrayList = new ArrayList<>(list);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));}
        System.out.println("");

        String[] Inomarki = {"BMW", "VW", "Nissan", "Toyota", "Lexus"};
        for (int i = 0; i < Inomarki.length; i++) {
            arrayList.set(i, Inomarki[i]);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("");

        for (int i = 0; i < 2; i++) {
            arrayList.remove(0);
        }

        for (int i = 0; i < 2; i++) {
            int theSize = arrayList.size();
            arrayList.remove(theSize - 1);


        }
        arrayList.add (3, "------");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));}
        System.out.println("");

    }

}

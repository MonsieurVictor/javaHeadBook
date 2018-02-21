package com.vvv.chapter1;

/**
 * output text generated from 3 massives using random function
 */

public class PhraseOMatic {

    public static void main(String[] args) {
        String[] listOne = {
            "24/7", "multi-Tier", "30,000 foot", "B-to-B",
            "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma",
            "critical-path", "dynamic"
        };
        String[] listTwo = {
            "empowered", "sticky", "value-added", "oriented", "centric",
            "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked",
            "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"
        };
        String[] listThree = {
            "process", "tipping-point", "solution", "architecture", "core competency",
            "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"
        };
        /*
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        */
        String phrase = randWordFrom(listOne) + " " +  randWordFrom(listTwo) + " " +  randWordFrom(listThree);
        System.out.println("What we need is a " + phrase);
    }

    static String randWordFrom(String[] list) {
        return list[(int) (Math.random() * list.length)];

/*      int  random = (int) (Math.random() * list.length);
        String word =  list [random];
        return word;*/
    }
}




package com.vvv.chapter4;

public class Compiler4 {
    public static void main(String [] args) {
        int orig = 42;
        Compiler4 x = new Compiler4();
        int y = x.go(orig);
        System.out.println(orig + " " + y);}

        int go(int arg) {
        arg = arg * 2;
        return arg;
        }
}

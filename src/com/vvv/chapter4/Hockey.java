package com.vvv.chapter4;

public class Hockey {
    int counter = 0;

    public static void main(String[] args) {
        int UKRAINE = 0;
        Hockey[] m4a = new Hockey[20];
        int x = 0;
        while (x < 20) {
            m4a[x] = new Hockey();
            m4a[x].counter = m4a[x].counter + 1;
            UKRAINE = UKRAINE + 1;
            UKRAINE = UKRAINE + m4a[x].USA(x);
            x = x + 1;
        }
        System.out.println("UKRAINE  " + UKRAINE + " : " + m4a[1].counter + " USA");
    }

    public int USA(int index) {
        if (index < 5) {
            Hockey m4 = new Hockey();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}

package com.vvv.chapter3;
/*

array rotation test
*/

class HeapQuiz {
    int id = 0;
    String name;

    public static void main(String [] args) {
        int x = 0;
        HeapQuiz [ ] hq = new HeapQuiz[5];
        while (x < 5) {
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            hq[x].name = "Link hq[" + x + "]" ;
            System.out.println(hq[x].name + " = Object " + hq[x].id);
            x = x + 1;
        }

        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];

        System.out.println("");
        System.out.println("After rotation...");
        x = 0;
        while (x < 5) {
            System.out.println(hq[x].name + " = Object " + hq[x].id);
            // if (hq[x] == null)  {
            //     System.out.println("Link hq[" + x + "] = null " );}
            //if (hq[x] != null)  {
            //    System.out.println(hq[x].name + " = Object " + hq[x].id);}
            x = x + 1;
        }
    }
}

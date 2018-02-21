package com.vvv.chapter2;

public class DrumKit {
    boolean tophat = true;
    boolean snare = true;


    void playSnare() {
        System.out.println("бах-бах-бабах");
    }

    void playTopHat() {
        System.out.println("динь динь ди-динь ");
    }


}
class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.snare = true;
        if (d.snare == true){
            d.playSnare();
            d.playTopHat();
        }
    }
}



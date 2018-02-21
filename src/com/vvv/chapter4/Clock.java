package com.vvv.chapter4;

//print time with getter and setter

class Clock {
    String time;
    void setTime(String t) {
        time = t;
    }
    String getTime() {
        return time;
    }
}
class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("время: " + tod);

    }
}


//print time with getter only

/*
class Clock {
    static String setTime(String time) {
        return time;
    }
}
class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        String tod =c.setTime("1245");
        System.out.println("время: " + tod);

    }
}
*/

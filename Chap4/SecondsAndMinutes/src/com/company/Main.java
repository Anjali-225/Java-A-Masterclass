package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(90,30));
        System.out.println(getDurationString(69));
    }

    public static String getDurationString(long minutes, long seconds ){

        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return "Invalid Value";
        } else {
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;
            return hours + "h " + remainingMinutes + "m " + seconds + "s";
        }
    }

    public static String getDurationString( long seconds ){

        if (seconds < 0) {
            return "Invalid Value";
        } else {
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            return minutes + "m " + remainingSeconds + "s";
        }
    }

}

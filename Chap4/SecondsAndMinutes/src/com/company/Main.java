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

            String hoursString = hours + "h ";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }

            String minutesString = minutes + "m ";
            if (remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            return hoursString  + minutesString +  secondsString ;
        }
    }

    public static String getDurationString( long seconds ){

        if (seconds < 0) {
            return "Invalid Value";

        } else {

            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;

            String minutesString = minutes + "m ";
            if (minutes < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString = remainingSeconds + "s";
            if (remainingSeconds < 10) {
                secondsString = "0" + secondsString;
            }

            return minutesString + secondsString ;
        }
    }

}

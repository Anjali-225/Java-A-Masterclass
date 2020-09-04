package com.company;

public class Main {

    public static void main(String[] args) {

        printSwitchDayOfTheWeek(-1);
        printSwitchDayOfTheWeek(1);
        printSwitchDayOfTheWeek(0);
        printSwitchDayOfTheWeek(2);
        printSwitchDayOfTheWeek(3);
        printSwitchDayOfTheWeek(4);
        printSwitchDayOfTheWeek(5);
        printSwitchDayOfTheWeek(6);


        printIfDayOfTheWeek(-1);
        printIfDayOfTheWeek(0);
        printIfDayOfTheWeek(1);
        printIfDayOfTheWeek(2);
        printIfDayOfTheWeek(3);
        printIfDayOfTheWeek(4);
        printIfDayOfTheWeek(5);
        printIfDayOfTheWeek(6);

    }

    public static void printSwitchDayOfTheWeek( int day) {

        switch (day) {
            case 0 :
                System.out.println("Sunday");
                break;
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }

    }

    public static void printIfDayOfTheWeek(int day) {

        if (day == 0){
            System.out.println("Sunday");
        } else if (day == 1){
            System.out.println("Monday");
        } else if (day == 2){
            System.out.println("Tuesday");
        } else if (day == 3){
            System.out.println("Wednesday");
        } else if (day == 4){
            System.out.println("Thursday");
        } else if (day == 5){
            System.out.println("Friday");
        } else if (day == 6){
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid Day!");
        }

    }

}

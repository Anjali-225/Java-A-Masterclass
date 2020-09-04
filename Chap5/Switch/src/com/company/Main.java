package com.company;

public class Main {

    public static void main(String[] args) {
        //Video 62 - like how we learned in section4
	    int value = 3;
	    if(value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

	    // Section 5 style
        int switchValue = 1;

	    switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        //Challenge
        char switchChar = 'A';

        switch(switchChar) {
            case 'A':
                System.out.println("Char was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;

            default:
                System.out.println("Was not A or B");
                break;
        }

        String switchMonth = "January";

        switch(switchMonth.toUpperCase()) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not Sure");
                break;
        }

    }
}

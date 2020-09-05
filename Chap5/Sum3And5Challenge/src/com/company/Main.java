package com.company;

public class Main {

    public static void main(String[] args) {

        //video 66

        int total = 0;
        int count = 0;

        for (int i=1; i<=1000; i++) {

            if ( (i % 3 == 0) && (i % 5 == 00)  ) {
                count++;
//                total = total + i;
                total += i;
                System.out.println("Found number = " + i);
            }

            if (count == 10) {
                break;
            }
        }
        System.out.println("********************");
        System.out.println("The sum is " + total);

    }
}

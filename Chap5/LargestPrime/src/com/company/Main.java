package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        } // end if

        int originalNumber = number;
        int largestPrimeFactor = 0;
        for (int i = 2; i <= originalNumber; i++) {
            if (number % i == 0) {
                largestPrimeFactor = i;
                number /= i;
                i--;
            } // end if
        } // end for loop

        return largestPrimeFactor;

    } // end getLargestPrime method

//    public static int getLargestPrime( int number) {
//        if (number <= 1) {
//            return -1;
//        }
//
//        int factorCounter = 0;
//        int greatestNum = 0;
//
//        for (int i = 2 ; i < number; i++){
//
//            if (number % i == 0){
//                factorCounter++;
//                greatestNum = i;
//            }
//
//        }
//
//        if (factorCounter > 2){
//            return greatestNum;
//        } else {
//            return number;
//        }
//
//    }
}

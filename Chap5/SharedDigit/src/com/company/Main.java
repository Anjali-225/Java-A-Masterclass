package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(12, 43));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (((num1 < 10) || (num2 < 10)) || ((num1 > 99) || (num2 > 99))) {
            return false;
        }

        int num1Digit1 = 0;
        int num1Digit2 = 0;
        int num2Digit1 = 0;
        int num2Digit2 = 0;

        while ((num1 >= 10) || (num2 >= 10)) {
            num1Digit2 = num1 % 10;
            num2Digit2 = num2 % 10;

            num1 /= 10;
            num1Digit1 = num1;

            num2 /= 10;
            num2Digit1 = num2;

            if ((num1Digit1 == num2Digit1) || (num1Digit1 == num2Digit2) ||
                    (num1Digit2 == num2Digit1) || (num1Digit2 == num2Digit2)) {
                return true;
            }
        }
        return false;
    }

//    public static boolean hasSharedDigit(int num1, int num2) {
//        if ((num1 < 10) || (num2 < 10) || (num1 > 99) || (num2 > 99)) {
//            return false;
//        }
//
//        int Digit1 ;
//        int Digit2 ;
//        int Digit3 ;
//        int Digit4 ;
//
//        while ((num1 >= 10) || (num2 >= 10)) {
//            Digit1 = num1 % 10;
//            Digit2 = num2 % 10;
//
//            num1 /= 10;
//            Digit3 = num1;
//
//            num2 /= 10;
//            Digit4 = num2;
//
//            if ((Digit1 == Digit2) || (Digit1 == Digit4) ||
//                    (Digit2 == Digit3) || (Digit2 == Digit4)) {
//                return true;
//            }
//        }
//        return false;
//    }
}

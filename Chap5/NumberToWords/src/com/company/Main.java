package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//
//        System.out.println();
//
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));
//
//        System.out.println();
//
//        numberToWords(123);
//        numberToWords(1010);
//        numberToWords(1000);
//        numberToWords(-12);
        numberToWords(0);
        numberToWords(101);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        if (number == 0){
            System.out.println("Zero");
        }

        int originalNumber = number;
        int reverseNumber = reverse(number);
        int checkReverse = reverse(number);

        while (reverseNumber > 0) {
            int lastDigit = reverseNumber % 10;
            switch (lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverseNumber /= 10;
        }

//        if (getDigitCount(originalNumber) != getDigitCount(reverseNumber)) {
//            for (int count = 1; count <= (getDigitCount((originalNumber) - getDigitCount(reverseNumber)));
//                count++) {
//                System.out.println("Zero");
//            }
//        }
        if (number > checkReverse)
            for (int i = 0; i < (getDigitCount(number) - getDigitCount(checkReverse)); i++ )
            {
                System.out.print("Zero ");
            }

    }

    public static int reverse(int number) {
//        int reverseNumber = 0;
//        while (Math.abs(number) > 0) {
//            int lastDigit = number % 10;
//            reverseNumber = (reverseNumber * 10) + lastDigit;
//            number /= 10;
//        }
//        return reverseNumber;

        int reverseNumber = 0;
        while (number != 0)
        {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
//        int count = 0;
//        if (number < 0) {
//            return -1;
//        } while (number >= 0) {
//            number /= 10;
//            count++;
//        }
//        return count;

        if(number < 0)
            return -1;

        if (number == 0)
            return 1;

        int count = 0;
        while(number > 0)
        {
            count++;
            number /= 10;
        }
        return count;
    }

}

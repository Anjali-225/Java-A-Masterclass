package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit = 0;
        int check = number;
        while (number!= 0) {
            lastDigit = number % 10;
            reverse *=  10;
            reverse +=  lastDigit;
            number /=  10;
        } if (check == reverse) {
            return true;
        } else {
            return false;
        }
    }
}

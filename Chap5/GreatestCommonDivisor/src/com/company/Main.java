package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }
        int minimum = Math.min(first, second);

        if (first % minimum == 0 && second % minimum == 0) {
            return minimum;
        } else {
            for (int i = (minimum /2); i > 0; i--) {
                if ((first % i == 0) && (second % i == 0)){
                    return i;
                }
            }
        }
        return -1;
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int numberCount = 0;
        int sum = 0;
        long avg = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                numberCount++;
                sum += number;
            } else {
//              System.out.println("SUM = XX AVG = YY");
                avg = Math.round((double) sum / numberCount);
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}

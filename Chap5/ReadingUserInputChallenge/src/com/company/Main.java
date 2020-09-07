package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberCount = 0;
        int sum = 0;

//        while (true){
        while (numberCount > 10) {

            int order = numberCount + 1;
            System.out.println("Enter number #" + order + ":");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                numberCount++;
                sum += number;

//                if (numberCount == 10) {
//                    break;
//                }

            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); //handle end of line (enter key)
        }

        System.out.println("Sum = " + sum);

        scanner.close();

    }
}

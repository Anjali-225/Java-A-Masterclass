package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)

        System.out.println("Enter you name: ");
        String name = scanner.nextLine();

        int age = 2020 - yearOfBirth;

        System.out.println("Your name is " + name);
        System.out.println("You are " + age + " years old");

        scanner.close();

    }
}

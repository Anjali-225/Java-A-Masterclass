package com.company;

public class Main {

    public static void main(String[] args) {
        //Video 32

        int result = 1+ 2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("prevoiusResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) is 1
        System.out.println("4 % 3 = " + result);

        //Video 33

        //result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        //result = result - 1;
        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " +result);

        //result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " +result);

        //result = result / 3;
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " +result);

        //result = result - 2;
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " +result);

        System.out.println("");

        //Video 34
        //If-Then-Statements
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        System.out.println("");

        //Video 35
        //Logical And Operators
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater that second top score and less than 100");
        }

        //Video 36
        //Logical OR operator
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both conditions are true");
        }

        //Video 37
        int newValue = 50; // Assignment operator
        if (newValue == 50) { //Equals To Operator
            System.out.println("This is an error");
        }



    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        // video 47

        calculateScore1(true, 800, 5, 100);
        calculateScore1(true, 10000, 8, 200);

        int highScore1 =  calculateScore2(true, 800, 5, 100);
        System.out.println("Your final score is " + highScore1);
        int highScore2 = calculateScore2(true, 10000, 8, 200);
        System.out.println("Your final score is " + highScore2);
    }

    public static void calculateScore1(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) { //Called scope
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }else {
            return -1;
        }
    }
}

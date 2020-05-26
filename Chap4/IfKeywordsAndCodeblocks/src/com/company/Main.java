package com.company;

public class Main {

    public static void main(String[] args) {
        // video 45
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but " +
//                    "greater than one thousand");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver == true) { //Called scope
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        //Any variables declared in the code block cant be used
        // outside of the codeblock

        //Challenge

        boolean newGameOver = true;
        int newScore = 10000;
        int newlevelCompleted = 8;
        int newBonus = 200;

        if (newGameOver) {
            int newFinalScore = newScore + (newlevelCompleted * newBonus);
            System.out.println("Your final score was: " + newFinalScore);
        }
    }
}

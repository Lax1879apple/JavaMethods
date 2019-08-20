package com.JavaLearning;

public class Main {

    public static void main(String[] args) {

	calculateScore(true, 100, 5, 5);
	calculateScore(true, 200, 2, 10);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 100;
			System.out.println("Your final score was = " +  finalScore);
			return finalScore;
		}
		else {
			return -1; // -1 will return value not found or throw error.
		}
	}

}

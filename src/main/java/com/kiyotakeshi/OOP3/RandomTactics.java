package com.kiyotakeshi.OOP3;

public class RandomTactics implements Tactics {

    public RandomTactics() {
    }

    @Override
    public int readTactics() {
        int hand = 0;

        double randomNum = Math.random() * 3;

        if (randomNum < 1) {
            hand = Player.STONE;
            System.out.println("stone");
        } else if (randomNum < 2) {
            hand = Player.SCISSORS;
            System.out.println("scissors");
        } else if (randomNum < 3) {
            hand = Player.PAPER;
            System.out.println("paper");
        }
        return hand;
    }
}

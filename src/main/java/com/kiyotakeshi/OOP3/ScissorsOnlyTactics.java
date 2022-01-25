package com.kiyotakeshi.OOP3;

public class ScissorsOnlyTactics implements Tactics {

    public ScissorsOnlyTactics() {
    }

    @Override
    public int readTactics() {
        return Player.SCISSORS;
    }
}

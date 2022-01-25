package com.kiyotakeshi.OOP3;

public class CircleTactics implements Tactics {

    int lastHand = -1;

    public CircleTactics() {
    }

    @Override
    public int readTactics() {
        lastHand = (lastHand + 1) % 3;
        return lastHand;
    }
}

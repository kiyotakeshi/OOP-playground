package com.kiyotakeshi.OOP2;

public class Popcorn extends Player {

    public Popcorn(String name) {
        super(name);
    }

    @Override
    public int showHand() {
        return PAPER;
    }
}

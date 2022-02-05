package com.kiyotakeshi.OOP4;

import java.util.ArrayList;

public class Table {
    private ArrayList<Card[]> disposedCards = new ArrayList<>();

    public void disposedCard(Card[] card) {
        for (Card value : card) {
            System.out.print(value + " ");
        }
        System.out.println("is disposed");
        disposedCards.add(card);
    }
}

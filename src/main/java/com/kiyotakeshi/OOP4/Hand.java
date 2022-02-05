package com.kiyotakeshi.OOP4;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand = new ArrayList<>();

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card pickCard() {
        return hand.remove(0);
    }

    public void shuffle() {
        int number = hand.size();
        int position;
        // カード全体の枚数の2倍の回数抜き取って最後に加えているが
        // count < number + 1 でも十分
        for (int count = 0; count < number * 2; count++) {
            position = (int) (Math.random() * number);
            Card pickedCard = hand.remove(position);
            hand.add(pickedCard);
        }
    }

    public int getNumberOfCards() {
        return hand.size();
    }

    public Card[] findSameNumberCard() {
        int numberOfCards = hand.size();
        Card[] sameCards = null;

        if (numberOfCards == 0) {
            return null;
        }
        // 最後に追加されたカードを取得
        int lastIndex = numberOfCards - 1;
        Card lastAddedCard = hand.get(lastIndex);
        int lastAddedNumber = lastAddedCard.getNumber();

        for (int i = 0; i < lastIndex; i++) {
            Card card = hand.get(i);
            // 最後に追加されたカードと同じカードがあった場合、
            // sameCard に格納
            if (card.getNumber() == lastAddedNumber) {
                sameCards = new Card[2];
                sameCards[0] = hand.remove(lastIndex);
                sameCards[1] = hand.remove(i);

                break;
            }
        }
        return sameCards;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        int size = hand.size();
        if (size > 0) {
            for (Card card : hand) {
                sb.append(card);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

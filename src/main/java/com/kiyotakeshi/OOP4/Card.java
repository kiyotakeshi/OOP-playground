package com.kiyotakeshi.OOP4;

public class Card {
    public static final int JOKER = 0;
    public static final int SUIT_SPADE = 1;
    public static final int SUIT_DIAMOND = 2;
    public static final int SUIT_CLUB = 3;
    public static final int SUIT_HEART = 4;

    private int suit;
    private int number;

    public Card(int suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        if (number == 0) {
            sb.append("JK");
        } else {
            switch (suit) {
                case SUIT_SPADE:
                    sb.append("S");
                    break;
                case SUIT_DIAMOND:
                    sb.append("D");
                    break;
                case SUIT_CLUB:
                    sb.append("C");
                    break;
                case SUIT_HEART:
                    sb.append("H");
                    break;
                default:
                    break;
            }
            switch (number) {
                case 1:
                    sb.append("A");
                    break;
                case 10:
                    sb.append("T");
                    break;
                case 11:
                    sb.append("J");
                    break;
                case 12:
                    sb.append("Q");
                    break;
                case 13:
                    sb.append("K");
                    break;
                default:
                    sb.append(number);
                    break;
            }
        }
        return sb.toString();
    }
}

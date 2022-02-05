package com.kiyotakeshi.OOP4;

public class OldMaid {

    public static void main(String[] args) {
        Master master = new Master();
        Table field = new Table();

        Player mike = new Player("mike", master, field);
        Player popcorn = new Player("popcorn", master, field);
        Player yamada = new Player("yamada", master, field);

        master.registerPlayer(mike);
        master.registerPlayer(popcorn);
        master.registerPlayer(yamada);

        Hand trump = createTrump();

        master.prepareGame(trump);
        master.startGame();
    }

    private static Hand createTrump() {
        Hand trump = new Hand();
        for (int number = 1; number <= 13; number++) {
            trump.addCard(new Card(Card.SUIT_CLUB, number));
            trump.addCard(new Card(Card.SUIT_DIAMOND, number));
            trump.addCard(new Card(Card.SUIT_HEART, number));
            trump.addCard(new Card(Card.SUIT_SPADE, number));
        }

        trump.addCard(new Card(0, Card.JOKER));
        return trump;
    }
}

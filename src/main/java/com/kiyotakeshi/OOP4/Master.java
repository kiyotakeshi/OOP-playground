package com.kiyotakeshi.OOP4;

import java.util.ArrayList;

public class Master {
    private ArrayList<Player> players = new ArrayList<>();

    public void prepareGame(Hand cards) {
        System.out.println("deal cards\n");
        cards.shuffle();
        int numberOfCards = cards.getNumberOfCards();
        int numberOfPlayers = players.size();
        for (int i = 0; i < numberOfCards; i++) {
            Card card = cards.pickCard();
            Player player = players.get(i % numberOfPlayers);
            player.receiveCard(card);
        }
    }

    public void startGame() {
        System.out.println("\nstart old maid");
        // player が2人以上の間は処理
        for (int count = 0; 1 < players.size(); count++) {
            int playerIndex = count % players.size();
            int nextPlayerIndex = (count + 1) % players.size();

            Player player = players.get(playerIndex);
            Player nextPlayer = players.get(nextPlayerIndex);

            System.out.println("\n" + player + " turn");
            player.play(nextPlayer);
        }
        System.out.println("\nend old maid");
    }

    public void declareWin(Player winner) {
        System.out.println("\n" + winner + " is finish");
        players.remove(winner);

        if (players.size() == 1) {
            Player loser = players.get(0);
            System.out.println(loser + " is loser");
        }
    }

    public void registerPlayer(Player player) {
        players.add(player);
    }
}

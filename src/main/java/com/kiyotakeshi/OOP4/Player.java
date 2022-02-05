package com.kiyotakeshi.OOP4;

public class Player {

    private String name;
    private Master master;
    private Table table;
    private Hand hand = new Hand();

    public Player(String name, Master master, Table table) {
        this.name = name;
        this.master = master;
        this.table = table;
    }

    public void play(Player nextPlayer) {
        Hand nextHand = nextPlayer.showHand();
        Card pickedCard = nextHand.pickCard();
        System.out.println(this + ": picked " + pickedCard + " from " + nextPlayer);
        dealCard(pickedCard);

        if(hand.getNumberOfCards() == 0){
            master.declareWin(this);
        }else {
            System.out.println(this + ": has " + hand);
        }

    }

    private Hand showHand() {
        if(hand.getNumberOfCards() == 1){
            master.declareWin(this);
        }
        hand.shuffle();

        return hand;
    }

    private void dealCard(Card card) {
        hand.addCard(card);
        Card[] sameCards = hand.findSameNumberCard();
        if (sameCards != null){
            System.out.print(this + ":");
            table.disposedCard(sameCards);
        }
    }

    public void receiveCard(Card card){
        dealCard(card);
    }

    @Override
    public String toString() {
        return name;
    }
}

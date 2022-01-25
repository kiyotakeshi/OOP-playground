package com.kiyotakeshi.OOP3;

public class Player {
    public static final int STONE = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    private String name;
    private int winCount = 0;
    private Tactics tactics;

    public int showHand() {
        // Tactics(interface) の実装クラスに処理を委譲する
        // 手の出し方を interface に分離することで、プレイヤーはどのように手を出すかを考えなくて良くなった
        int hand = this.tactics.readTactics();
        return hand;
    }

    /*
    審判から勝敗を聞く
     */
    public void notifyResult(boolean result) {
        if (result) {
            winCount++;
        }
    }

    public Player(String name, Tactics tactics) {
        this.name = name;
        this.tactics = tactics;
    }

    public String getName(){
        return this.name;
    }

    public int getWinCount() {
        return this.winCount;
    }
}

package com.kiyotakeshi.OOP;

public class Player {
    public static final int STONE = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    private String name;
    private int winCount = 0;

    public int showHand() {
        int hand = 0;

        double randomNum = Math.random() * 3;

        if (randomNum < 1) {
            hand = STONE;
            System.out.println("stone");
        } else if (randomNum < 2) {
            hand = SCISSORS;
            System.out.println("scissors");
        } else if (randomNum < 3) {
            hand = PAPER;
            System.out.println("paper");
        }
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

    // コンストラクターはメソッド名がクラス名と同じで戻り値を返せない
    public Player(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getWinCount() {
        return this.winCount;
    }
}

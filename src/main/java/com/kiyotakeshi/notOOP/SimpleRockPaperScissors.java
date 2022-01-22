package com.kiyotakeshi.notOOP;

/*
コンピュータに行わせたいことを理解するために、ジャンケンのルールを明確化する。

・プレイヤーは2人
・ジャンケンは3回勝負
・3回勝負後、勝った回数が多いプレイヤーを最終的な勝ちとする
・引き分けも勝負の数としてカウントする
・3回勝負後、勝数が同じ場合は引き分けとする

プログラムの流れはフローチャートを作るとわかりやすい。

手続き型で実装した場合。

javac src/main/java/com/kiyotakeshi/notOOP/SimpleRockPaperScissors.java
java -classpath ./src/main/java/ com.kiyotakeshi.notOOP.SimpleRockPaperScissors

mvn clean package
java -classpath target/classes com.kiyotakeshi.notOOP.SimpleRockPaperScissors
 */
public class SimpleRockPaperScissors {

    private static final int STONE = 0;
    private static final int SCISSORS = 1;
    private static final int PAPER = 2;

    public static void main(String[] args) {
        System.out.println("start rock-paper-scissors\n");

        int player1WinCount = 0;
        int player2WinCount = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("start game" + (i + 1));
            double randomNum = 0;
            int player1Hand = 0;
            int player2Hand = 0;

            randomNum = Math.random() * 3;

            if (randomNum < 1) {
                player1Hand = STONE;
                System.out.println("stone");
            } else if (randomNum < 2) {
                player1Hand = SCISSORS;
                System.out.println("scissors");
            } else if (randomNum < 3) {
                player1Hand = PAPER;
                System.out.println("paper");
            }

            randomNum = Math.random() * 3;

            if (randomNum < 1) {
                player2Hand = STONE;
                System.out.println("stone");
            } else if (randomNum < 2) {
                player2Hand = SCISSORS;
                System.out.println("scissors");
            } else if (randomNum < 3) {
                player2Hand = PAPER;
                System.out.println("paper");
            }

            if ((player1Hand == STONE && player2Hand == SCISSORS)
                    || (player1Hand == SCISSORS && player2Hand == PAPER)
                    || (player1Hand == PAPER && player2Hand == STONE)) {
                player1WinCount++;
                System.out.println("result: player1 wins\n");
            } else if ((player1Hand == STONE && player2Hand == PAPER)
                    || (player1Hand == SCISSORS && player2Hand == STONE)
                    || (player1Hand == SCISSORS && player2Hand == STONE)
                    || (player1Hand == PAPER && player2Hand == SCISSORS)) {
                player2WinCount++;
                System.out.println("result: player2 wins\n");
            } else {
                System.out.println("result: draw\n");
            }
        }
        System.out.println("end rock-paper-scissors\n");

        if (player1WinCount > player2WinCount) {
            System.out.println(player1WinCount + " vs " + player2WinCount + " -> player1 wins");
        } else if (player2WinCount > player1WinCount) {
            System.out.println(player1WinCount + " vs " + player2WinCount + " -> player2 wins");
        } else if (player1WinCount == player2WinCount) {
            System.out.println(player1WinCount + " vs " + player2WinCount + " -> draw");
        }
    }
}

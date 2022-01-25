package com.kiyotakeshi.OOP3;

public class Judge {

    public void doRockPaperScissors(Player player1, Player player2) {
        System.out.println("start rock-paper-scissors\n");

        for (int i = 0; i < 3; i++) {
            System.out.println("start game" + (i + 1));

            Player winner = judgeRockPaperScissors(player1, player2);

            if (winner != null) {
                System.out.println("result: " + winner.getName() + " wins\n");
                winner.notifyResult(true);
            } else {
                System.out.println("result: draw\n");
            }
        }
        System.out.println("end rock-paper-scissors\n");

        Player finalWinner = judgeFinalWinner(player1, player2);
        System.out.println(player1.getWinCount() + " vs " + player2.getWinCount());
        if (finalWinner != null) {
            System.out.println("winner is " + finalWinner.getName());
        } else {
            System.out.println("draw");
        }
    }

    private Player judgeRockPaperScissors(Player player1, Player player2) {
        Player winner = null;
        int player1Hand = player1.showHand();
        int player2Hand = player2.showHand();

        printHand(player1Hand);
        System.out.print(" vs ");
        printHand(player2Hand);
        System.out.println();

        if ((player1Hand == Player.STONE && player2Hand == Player.SCISSORS)
                || (player1Hand == Player.SCISSORS && player2Hand == Player.PAPER)
                || (player1Hand == Player.PAPER && player2Hand == Player.STONE)) {
            winner = player1;
        } else if ((player1Hand == Player.STONE && player2Hand == Player.PAPER)
                || (player1Hand == Player.SCISSORS && player2Hand == Player.STONE)
                || (player1Hand == Player.SCISSORS && player2Hand == Player.STONE)
                || (player1Hand == Player.PAPER && player2Hand == Player.SCISSORS)) {
            winner = player2;
        }

        return winner;
    }

    private Player judgeFinalWinner(Player player1, Player player2) {
        Player winner = null;

        int player1WinCount = player1.getWinCount();
        int player2WinCount = player2.getWinCount();

        if (player1WinCount > player2WinCount) {
            winner = player1;
        } else if (player2WinCount > player1WinCount) {
            winner = player2;
        }

        return winner;
    }

    private void printHand(int hand) {
        switch (hand) {
            case Player.STONE:
                System.out.print("stone");
                break;
            case Player.SCISSORS:
                System.out.print("scissors");
                break;
            case Player.PAPER:
                System.out.print("paper");
                break;
        }
    }
}

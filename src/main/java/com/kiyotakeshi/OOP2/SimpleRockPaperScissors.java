package com.kiyotakeshi.OOP2;

/*
・好きなプレイヤー名を表示できるようにする
・プレイヤーの手の出し方をプレイヤーごとに変えられるようにする
・ジャンケンは3回勝負
・3回勝負後、勝った回数が多いプレイヤーを最終的な勝ちとする
・引き分けも勝負の数としてカウントする
・3回勝負後、勝数が同じ場合は引き分けとする
 */
public class SimpleRockPaperScissors {


    public static void main(String[] args) {
        Judge judge = new Judge();
        Player mike = new Mike("mike");
        Player popcorn = new Popcorn("popcorn");
        judge.doRockPaperScissors(mike, popcorn);
    }
}

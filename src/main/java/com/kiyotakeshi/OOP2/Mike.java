package com.kiyotakeshi.OOP2;

public class Mike extends Player{

    public Mike(String name) {
        super(name);
    }

    // 手の出し方を変えるためにプレイヤーごとにクラスを変えるのは、
    // 手の出し方は各プレイヤー固有のものであるという前提の考え方で拡張性が低い
    // プレイヤーが持っている戦略を変える、と考えたほうが拡張性が高いプログラムが作れる
    @Override
    public int showHand() {
        return STONE;
    }
}

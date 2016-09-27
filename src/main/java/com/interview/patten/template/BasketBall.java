package com.interview.patten.template;

public class BasketBall extends Game{

    @Override
    void endGame() {
        System.out.println("basket ball game over");
    }

    @Override
    void startGame() {
        System.out.println("start basket ball game");
    }

    @Override
    void initGame() {
        System.out.println("init basket ball game");
    }
}

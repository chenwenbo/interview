package com.interview.patten.template;

/**
 * Created by apple on 2016/09/27 23:21.
 */
public class FootBall extends Game{

    @Override
    void endGame() {
        System.out.println("foot ball game over");
    }

    @Override
    void startGame() {
        System.out.println("start foot ball game");
    }

    @Override
    void initGame() {
        System.out.println("init foot ball game");
    }
}

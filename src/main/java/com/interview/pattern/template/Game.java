package com.interview.pattern.template;

public abstract class Game {

    public void play(){
        initGame();
        startGame();
        endGame();
    }

    abstract void endGame();

    abstract void startGame();

    abstract void initGame();
}

package com.interview.patten.template;

import org.junit.Test;

public class TemplateTest {

    @Test
    public void templateTest() {
        Game footBall = new FootBall();
        Game basketBall = new BasketBall();
        footBall.play();
        basketBall.play();
    }
}


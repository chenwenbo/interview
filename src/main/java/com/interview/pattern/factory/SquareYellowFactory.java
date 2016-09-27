package com.interview.pattern.factory;

import com.interview.pattern.factory.color.Color;
import com.interview.pattern.factory.color.Yellow;
import com.interview.pattern.factory.shape.Shape;
import com.interview.pattern.factory.shape.Square;

public class SquareYellowFactory extends AbstactFactory {

    @Override
    public Shape getShape() {
        return new Square();
    }

    @Override
    Color getColor() {
        return new Yellow();
    }

}

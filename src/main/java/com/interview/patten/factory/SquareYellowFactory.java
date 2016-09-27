package com.interview.patten.factory;

import com.interview.patten.factory.color.Color;
import com.interview.patten.factory.color.Yellow;
import com.interview.patten.factory.shape.Shape;
import com.interview.patten.factory.shape.Square;

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

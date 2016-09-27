package com.interview.patten.factory;

import com.interview.patten.factory.color.Blue;
import com.interview.patten.factory.color.Color;
import com.interview.patten.factory.shape.Rectangle;
import com.interview.patten.factory.shape.Shape;

public class RectangleAndBlueFactory extends AbstactFactory {

    @Override
    public Shape getShape() {
        return new Rectangle();
    }

    @Override
    Color getColor() {
        return new Blue();
    }
}

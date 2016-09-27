package com.interview.pattern.factory;

import com.interview.pattern.factory.color.Blue;
import com.interview.pattern.factory.color.Color;
import com.interview.pattern.factory.shape.Rectangle;
import com.interview.pattern.factory.shape.Shape;

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

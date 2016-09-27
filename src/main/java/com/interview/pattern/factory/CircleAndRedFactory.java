package com.interview.pattern.factory;

import com.interview.pattern.factory.color.Color;
import com.interview.pattern.factory.color.Red;
import com.interview.pattern.factory.shape.Circle;
import com.interview.pattern.factory.shape.Shape;

public class CircleAndRedFactory extends AbstactFactory {

    @Override
    public Shape getShape() {
        return new Circle();
    }

    @Override
    Color getColor() {
        return new Red();
    }
}

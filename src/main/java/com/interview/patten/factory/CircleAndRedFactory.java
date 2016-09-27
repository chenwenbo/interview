package com.interview.patten.factory;

import com.interview.patten.factory.color.Color;
import com.interview.patten.factory.color.Red;
import com.interview.patten.factory.shape.Circle;
import com.interview.patten.factory.shape.Shape;

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

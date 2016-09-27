package com.interview.patten.factory;

import com.interview.patten.factory.color.Color;
import com.interview.patten.factory.shape.Shape;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractShapeFactoryTest {

    @Test
    public void abstractFactoryTest() {
        CircleAndRedFactory circleShapeFactory = new CircleAndRedFactory();
        Shape circle = circleShapeFactory.getShape();
        Color red = circleShapeFactory.getColor();
        SquareYellowFactory squareShapeFactory = new SquareYellowFactory();
        Shape square = squareShapeFactory.getShape();
        Color yellow = squareShapeFactory.getColor();
        RectangleAndBlueFactory rectangleShapeFactory = new RectangleAndBlueFactory();
        Shape rectangle = rectangleShapeFactory.getShape();
        Color blue = rectangleShapeFactory.getColor();

        assertEquals("circle", circle.draw());
        assertEquals("rectangle", rectangle.draw());
        assertEquals("square", square.draw());

        assertEquals("red", red.getColor());
        assertEquals("yellow", yellow.getColor());
        assertEquals("blue", blue.getColor());
    }
}
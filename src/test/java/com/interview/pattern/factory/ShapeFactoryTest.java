package com.interview.pattern.factory;

import com.interview.pattern.factory.shape.Shape;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeFactoryTest {

    @Test
    public void sampleFactoryTest() {
        Shape circle = ShapeFactory.getCircle();
        Shape rectangle = ShapeFactory.getRectangle();
        Shape square = ShapeFactory.getSquare();

        assertEquals("circle", circle.draw());
        assertEquals("rectangle", rectangle.draw());
        assertEquals("square", square.draw());
    }

    @Test
    public void factoryMethodTest() {
        Shape circle = ShapeFactory.getShape(ShapeFactory.CIRCLE);
        Shape rectangle = ShapeFactory.getShape(ShapeFactory.RECTANGLE);
        Shape square = ShapeFactory.getShape(ShapeFactory.SQUARE);

        assertEquals("circle", circle.draw());
        assertEquals("rectangle", rectangle.draw());
        assertEquals("square", square.draw());
    }
}
package com.interview.pattern.factory;

import com.interview.pattern.factory.color.Color;
import com.interview.pattern.factory.shape.Shape;

/**
 * abstract factory : 遵守了开放封闭原则，可以通过扩展类的方式进行拓展产品
 */
public abstract class AbstactFactory {

    abstract Shape getShape();

    abstract Color getColor();

}

package com.interview.pattern.factory;

import com.interview.pattern.factory.shape.Circle;
import com.interview.pattern.factory.shape.Rectangle;
import com.interview.pattern.factory.shape.Shape;
import com.interview.pattern.factory.shape.Square;

/**
 * simple factory & factory method : 工厂模式是我们最常用的实例化对象模式了，
 * 是用工厂方法代替new操作的一种模式。给系统带来更大的可扩展性和尽量少的修改量。
 * 缺点是增加工厂方法是需要修改代码，违反了 open-close 原则。另外简单工厂模式中的参数不可控，
 * 可通过enum的方式处理
 */
public class ShapeFactory {

    public static final String CIRCLE = "circle";
    public static final String RECTANGLE = "rectangle";
    public static final String SQUARE = "square";

    public static Shape getShape(String type) {
        if (CIRCLE.equals(type)) {
            return new Circle();
        }
        if (RECTANGLE.equals(type)) {
            return new Rectangle();
        }
        if (SQUARE.equals(type)) {
            return new Square();
        }
        return null;
    }

    public static Shape getCircle(){
        return new Circle();
    }

    public static Shape getSquare(){
        return new Square();
    }

    public static Shape getRectangle(){
        return new Rectangle();
    }

}

package com.interview.pattern.Decorator;

/**
 * description : 不修改原类型内部结构的情况下为其添加功能，通过构造函数传参的形式进行处理
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/07 16:09.
 */
public class RedShapeDecorator implements Shape {

    private final Shape shape;

    public RedShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }
}

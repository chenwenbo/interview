package com.interview.pattern.builder;

/**
 * description : 构建器，类似工厂模式，通过工厂类进行生产不同的产品
 * advantage : 可以将创建复杂的产品，并将产品的创建过程通过构造器进行拼接，屏蔽了产品生产的细节
 * This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/07 13:21.
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}

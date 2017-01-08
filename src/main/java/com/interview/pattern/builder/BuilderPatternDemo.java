package com.interview.pattern.builder;

/**
 * description : 构建器，类似工厂模式，通过工厂类进行生产不同的产品
 * advantage : 可以将创建复杂的产品，并将产品的创建过程通过构造器进行拼接，屏蔽了产品生产的细节
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/07 13:22.
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}

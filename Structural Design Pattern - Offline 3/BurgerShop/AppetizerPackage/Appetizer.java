package BurgerShop.AppetizerPackage;

import BurgerShop.MealDecoratorPackage.Meal;
import BurgerShop.MealDecoratorPackage.MealDecorator;

public abstract class Appetizer extends MealDecorator {

    public Appetizer(Meal baseMeal) {
        super(baseMeal);
    }
    public String Description() {
        return  super.Description();
    }
    public double getCost() {
        return super.getCost();
    }

}
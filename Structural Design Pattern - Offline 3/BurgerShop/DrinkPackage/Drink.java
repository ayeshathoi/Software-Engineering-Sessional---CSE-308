package BurgerShop.DrinkPackage;

import BurgerShop.MealDecoratorPackage.Meal;
import BurgerShop.MealDecoratorPackage.MealDecorator;

public abstract class Drink extends MealDecorator {

    public Drink(Meal baseMeal){
        super(baseMeal);
    }

    public abstract void setUnit(int unit);

}

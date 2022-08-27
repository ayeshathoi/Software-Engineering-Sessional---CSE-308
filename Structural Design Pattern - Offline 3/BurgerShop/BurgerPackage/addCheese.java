package BurgerShop.BurgerPackage;

import BurgerShop.MealDecoratorPackage.Meal;
import BurgerShop.MealDecoratorPackage.MealDecorator;

public class addCheese extends MealDecorator {
    public addCheese(Meal burger) {
        super(burger);
    }

    @Override
    public double getCost(){
        return BurgerBase.getCost() + 10.00;
    }

    @Override
    public String description() {
        return super.Description() + " with Cheese";
    }
}

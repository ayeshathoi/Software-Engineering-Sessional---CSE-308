package BurgerShop.AppetizerPackage;

import BurgerShop.MealDecoratorPackage.Meal;

public class FrenchFries extends Appetizer {

    public FrenchFries(Meal baseMeal){
        super(baseMeal);
    }

    @Override
    public String description() {
        return super.Description() + " and French Fries";

    }

    @Override
    public double getCost(){
        return super.getCost() + 70.00;
    }

}
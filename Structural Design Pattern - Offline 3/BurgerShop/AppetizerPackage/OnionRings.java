package BurgerShop.AppetizerPackage;

import BurgerShop.MealDecoratorPackage.Meal;

public class OnionRings extends Appetizer {

    public OnionRings(Meal baseMeal){
        super(baseMeal);
    }

    @Override
    public String description() {

        return super.Description() + " and Onion Rings";
    }

    @Override
    public double getCost() {
        return super.getCost() + 50.00;
    }

}
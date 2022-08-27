package BurgerShop.DrinkPackage;

import BurgerShop.MealDecoratorPackage.Meal;

public class Water extends Drink {
    private double price = super.getCost();

    public Water(Meal baseMeal,int unit){
        super(baseMeal);
        setUnit(unit);
    }

    @Override
    public void setUnit(int unit) {
        price+=10*unit;
    }

    @Override
    public String description() {
        return super.Description() + " and Water";
    }
    @Override
    public double getCost(){
        return price;
    }
}
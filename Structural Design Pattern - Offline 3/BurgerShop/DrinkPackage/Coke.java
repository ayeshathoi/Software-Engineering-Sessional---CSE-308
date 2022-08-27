package BurgerShop.DrinkPackage;

import BurgerShop.MealDecoratorPackage.Meal;

public class Coke extends Drink {
    private double price = super.getCost();
    public Coke(Meal baseMeal,int unit){
        super(baseMeal);
        setUnit(unit);
    }

    @Override
    public void setUnit(int unit) {
        price+=30*unit;
    }

    @Override
    public String description() {
        return super.Description() + " and Coke";
    }
    @Override
    public double getCost(){
        return price;
    }

}
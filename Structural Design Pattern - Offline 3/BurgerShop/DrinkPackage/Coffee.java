package BurgerShop.DrinkPackage;

import BurgerShop.MealDecoratorPackage.Meal;

public class Coffee extends Drink {
    private double price = super.getCost();
    public Coffee(Meal baseMeal,int unit){
        super(baseMeal);
        setUnit(unit);
    }

    @Override
    public String description() {
        return super.Description() + " and Coffee";
    }

    @Override
    public double getCost(){
        return price;
    }
    @Override
    public void setUnit(int unit)
    {
        price+=50*unit;
    }
}
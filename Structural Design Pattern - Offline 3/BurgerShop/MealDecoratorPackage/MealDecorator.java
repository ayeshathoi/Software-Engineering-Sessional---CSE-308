package BurgerShop.MealDecoratorPackage;

public abstract class MealDecorator implements Meal {

    protected Meal BurgerBase;

    public MealDecorator(Meal BurgerBase){
        this.BurgerBase = BurgerBase;
    }

    public String Description(){
        return BurgerBase.description();
    }
    public double getCost(){

        return BurgerBase.getCost();
    }

}
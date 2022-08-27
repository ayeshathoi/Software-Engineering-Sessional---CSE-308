package BurgerShop.BurgerPackage;

public class ChickenBurger extends Burger {
    @Override
    public String description() {
        return "Chicken Burger";
    }

    @Override
    public double getCost() {
        return 220.00;
    }
}

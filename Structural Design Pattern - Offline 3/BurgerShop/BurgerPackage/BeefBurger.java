package BurgerShop.BurgerPackage;

public class BeefBurger extends Burger {

    @Override
    public String description() {
        return "Beef Burger";
    }

    @Override
    public double getCost() {
        return 250.00;
    }
}

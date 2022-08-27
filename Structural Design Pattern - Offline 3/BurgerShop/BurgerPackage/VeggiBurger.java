package BurgerShop.BurgerPackage;

public class VeggiBurger extends Burger {
    @Override
    public String description() {
        return  "Veggie Burger";
    }

    @Override
    public double getCost() {
        return 200.00;
    }
}

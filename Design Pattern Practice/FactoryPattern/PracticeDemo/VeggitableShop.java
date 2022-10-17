package CreationalDesignPattern.FactoryPattern.PracticeDemo;

import CreationalDesignPattern.FactoryPattern.PracticeDemo.Shop;

public class VeggitableShop implements Shop {

    @Override
    public void description() {
        System.out.println("It's a VeggitableShop");
    }
}

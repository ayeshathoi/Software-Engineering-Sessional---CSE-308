package CreationalDesignPattern.FactoryPattern.PracticeDemo;

public class ShopFactory {
    public Shop getShop(String s)
    {
        if(s.equalsIgnoreCase("F"))
            return new FlowerShop();
        else if (s.equalsIgnoreCase("FR"))
            return new FruitShop();
        else if (s.equalsIgnoreCase("v"))
            return new VeggitableShop();
        return null;
    }
}

package CreationalDesignPattern.FactoryPattern.PracticeDemo;


public class Client {

    public static void main(String[] args) {
        ShopFactory s = new ShopFactory();
        Shop sf = s.getShop("v");
        sf.description();

    }
}

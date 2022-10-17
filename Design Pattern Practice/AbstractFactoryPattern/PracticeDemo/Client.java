package CreationalDesignPattern.AbstractFactoryPattern.PracticeDemo;

public class Client {
    public static void main(String[] args)
    {
        AbstractFactory s = FactoryCreator.getType("Dance");
        Dance d = s.getDance("hiphop");
        d.GetDanceType();
        AbstractFactory t = FactoryCreator.getType("Music");
        Music m = t.getMusic("Folk");
        m.GetType();

    }
}

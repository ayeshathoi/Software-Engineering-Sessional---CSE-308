package CreationalDesignPattern.AbstractFactoryPattern.PracticeDemo;

public class FactoryCreator {
    public static AbstractFactory getType(String s)
    {
        if(s.equalsIgnoreCase("Music"))
            return new MusicFactory();
        else if(s.equalsIgnoreCase("Dance"))
            return new DanceFactory();
        return null;
    }
}

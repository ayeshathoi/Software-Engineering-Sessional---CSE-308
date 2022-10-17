package CreationalDesignPattern.AbstractFactoryPattern.PracticeDemo;

public class DanceFactory implements AbstractFactory {

    @Override
    public Dance getDance(String dance) {
        if (dance.equalsIgnoreCase("HipHop"))
            return new HipHop();
        else if(dance.equalsIgnoreCase("Tagore"))
            return new Tagore();
        return null;
    }

    @Override
    public Music getMusic(String music) {
        return null;
    }
}

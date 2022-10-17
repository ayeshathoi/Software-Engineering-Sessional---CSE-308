package CreationalDesignPattern.AbstractFactoryPattern.PracticeDemo;

public class MusicFactory implements AbstractFactory {

    @Override
    public Dance getDance(String s) {
        return null;
    }

    @Override
    public Music getMusic(String music) {
        if(music.equalsIgnoreCase("Rock"))
            return new Rock();
        else if(music.equalsIgnoreCase("Folk"))
            return new Folk();
        return null;
    }
}

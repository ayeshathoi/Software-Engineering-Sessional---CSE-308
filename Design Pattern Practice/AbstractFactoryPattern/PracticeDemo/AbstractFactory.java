package CreationalDesignPattern.AbstractFactoryPattern.PracticeDemo;

public interface AbstractFactory {
    public Dance getDance(String dance);
    public Music getMusic(String music);
}

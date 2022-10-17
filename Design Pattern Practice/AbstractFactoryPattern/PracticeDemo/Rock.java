package CreationalDesignPattern.AbstractFactoryPattern.PracticeDemo;

import CreationalDesignPattern.AbstractFactoryPattern.PracticeDemo.Music;

public class Rock implements Music {

    @Override
    public void GetType() {
        System.out.println("It's Rock music");
    }
}

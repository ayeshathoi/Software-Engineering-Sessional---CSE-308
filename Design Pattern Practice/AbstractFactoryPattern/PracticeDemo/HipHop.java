package CreationalDesignPattern.AbstractFactoryPattern.PracticeDemo;

import CreationalDesignPattern.AbstractFactoryPattern.PracticeDemo.Dance;

public class HipHop implements Dance {

    @Override
    public void GetDanceType() {
        System.out.println("HipHop");
    }
}

package BehaviouralDesignPattern.Observer.Demo1;

import BehaviouralDesignPattern.Observer.Demo1.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;
    public int getState()
    {
        return state;
    }
    public void setState(int state)
    {
        this.state = state;
        notifyAllObservers();
    }
    public void attach(Observer o)
    {
        observers.add(o);
    }

    private void notifyAllObservers() {
        int i =0;
        for(Observer observer : observers)
        {
            // shob observer der data nibe
            observer.update();
        }
    }
}

package BehaviouralDesignPattern.Observer.Demo2;

import java.util.ArrayList;
import java.util.List;

class Subject implements ISubject
{
    private int myValue;
    List<IObserver> observersList=new ArrayList<IObserver>();
    public void setMyValue(int myValue) {
        this.myValue = myValue;
        //Notify observers
        notifyObservers(myValue);
    }

    @Override
    public void register(IObserver o)
    {
        observersList.add(o);
    }
    @Override
    public void unregister(IObserver o)
    {
        observersList.remove(o);
    }
    @Override
    public void notifyObservers(int updatedValue)
    {
        for(int i=0;i<observersList.size();i++)
        {
            observersList.get(i).update(updatedValue);
        }
    }
}

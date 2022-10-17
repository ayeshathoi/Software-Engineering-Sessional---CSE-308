package BehaviouralDesignPattern.Observer.Demo2;

interface ISubject
{
    //add
    void register(IObserver o);
    //remove
    void unregister(IObserver o);
    //notify
    void notifyObservers(int i);
}
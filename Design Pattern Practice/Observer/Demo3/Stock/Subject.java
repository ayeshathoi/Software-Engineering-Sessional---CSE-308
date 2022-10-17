package BehaviouralDesignPattern.Observer.Demo3.Stock;

public interface Subject {
    void notifyObservers(String stockName, String message);
}

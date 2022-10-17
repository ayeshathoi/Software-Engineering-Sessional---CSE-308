package BehaviouralDesignPattern.Strategy.Demo2;

public class Multiplication implements Strategy{

    @Override
    public float calculation(float a, float b){
        return a*b;
    }
}
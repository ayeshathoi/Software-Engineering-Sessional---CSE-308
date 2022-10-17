package BehaviouralDesignPattern.Mediator.Demo3;

public class Colleague1 extends Colleague{
    public Colleague1(Mediator mediator)
    {
       this.mediator = mediator;
       mediator.registerA(this);

    }
    @Override
    public void doSomething() {
        mediator.talk();
    }
}

package BehaviouralDesignPattern.Mediator.Demo3;

public class Colleague2 extends Colleague{

    public Colleague2(Mediator mediator)
    {
        this.mediator = mediator;
        mediator.registerB(this);

    }

    @Override
    public void doSomething() {
        mediator.fight();
    }
}

package BehaviouralDesignPattern.Mediator.Demo3;

public class MediatorPatternEx {
    public static void main(String []args)
    {
        Mediator mediator = new ConcreteMediator();
        Colleague1 talk = new Colleague1(mediator);
        talk.doSomething();
        Colleague2 fight = new Colleague2(mediator);
        fight.doSomething();

    }
}

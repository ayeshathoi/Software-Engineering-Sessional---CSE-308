package BehaviouralDesignPattern.Mediator.Demo3;

public class ConcreteMediator implements Mediator{
    Colleague talk;
    Colleague fight;

    @Override
    public void talk() {
        System.out.println("Mediator is talkinggg");
    }

    @Override
    public void fight() {
        System.out.println("Mediator is fighting");
    }

    @Override
    public void registerA(Colleague1 a) {
            this.talk = a;
        System.out.println(a);
    }

    @Override
    public void registerB(Colleague2 a) {
        this.fight = a;
        System.out.println(a);
    }
}

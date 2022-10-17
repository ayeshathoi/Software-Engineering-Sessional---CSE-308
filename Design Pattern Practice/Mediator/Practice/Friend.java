package BehaviouralDesignPattern.Mediator.Practice;

public abstract class Friend {
    Mediator mediator;
    String name;
    Friend(Mediator m, String friendName)
    {
        this.mediator = m;
        this.name = friendName;
    }

}

package BehaviouralDesignPattern.Mediator.Practice;

public class Friend2 extends Friend{
    Friend2(Mediator m, String friendName) {
        super(m, friendName);
    }
    public void notification(String msg)
    {
        System.out.println(name + " gets the msg : " + msg);
    }
}

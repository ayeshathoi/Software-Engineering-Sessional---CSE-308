package BehaviouralDesignPattern.Mediator.Practice;

public class Friend1 extends Friend{

    Friend1(Mediator m, String friendName) {
        super(m, friendName);
    }
    public void notification(String msg)
    {
        System.out.println(name + "gets the msg :" + msg);
    }
}

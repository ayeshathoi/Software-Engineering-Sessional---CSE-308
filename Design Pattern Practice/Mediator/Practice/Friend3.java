package BehaviouralDesignPattern.Mediator.Practice;

public class Friend3 extends Friend{
    Friend3(Mediator m, String friendName) {
        super(m, friendName);
    }
    public void notification(String msg)
    {
        System.out.println(name +  " gets the msg : " + msg);
    }
}

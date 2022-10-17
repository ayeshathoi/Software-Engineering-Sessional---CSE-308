package BehaviouralDesignPattern.Mediator.Practice;

public class ConcreteMediator implements Mediator{

    public Friend1 friend1;
    public Friend2 friend2;
    public Friend3 friend3;
    public void setFriend1(Friend1 f)
    {
        friend1 = f;
    }
    public void setFriend2(Friend2 f)
    {
        friend2 = f;
    }
    public void setFriend3(Friend3 f)
    {
        friend3  = f;
    }
    @Override
    public void sendMsg(Friend friend, String msg) {
        if(friend == friend1)
        {
            friend2.notification("from " +  friend1.name + " " +  msg);
            friend3.notification("from " +  friend1.name+  " " +msg);
        }
        else if(friend == friend2)
        {
            friend1.notification(friend2.name + " sends the msg: " +msg);
            friend3.notification(friend2.name + " sends the msg: " +msg);
        }
        else if(friend == friend3)
        {
            friend2.notification(friend3.name + " sends the msg:" + msg);
            friend1.notification(friend3.name + " sends the msg: " +msg);
        }

    }
}

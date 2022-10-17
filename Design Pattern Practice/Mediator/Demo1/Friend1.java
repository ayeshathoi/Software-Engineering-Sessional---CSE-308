package BehaviouralDesignPattern.Mediator.Demo1;

class Friend1 extends Friend
{
    public Friend1(Mediator mediator,String name)
    {
        super(mediator);
        this.name = name;
        // name of the friend1
    }
    public void Send(String msg)
    {
        mediator.Send(this,msg);
    }
    public void Notify(String msg)
    {
        System.out.println("Amit gets message: "+ msg);
    }
}

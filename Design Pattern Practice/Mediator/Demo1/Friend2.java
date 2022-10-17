package BehaviouralDesignPattern.Mediator.Demo1;

class Friend2 extends Friend
{
    // Constructor
    public Friend2(Mediator mediator,String name)
    {
        super(mediator);
        this.name = name;
        // name of the friend2
    }
    public void Send(String msg)
    {
        mediator.Send(this,msg);
    }
    public void Notify(String msg)
    {
        System.out.println("Sohel gets message: "+ msg);
    }
}
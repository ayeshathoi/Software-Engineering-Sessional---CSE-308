package BehaviouralDesignPattern.Mediator.Demo1;

class Boss extends Friend
{
    // Constructor
    public Boss(Mediator mediator,String name)
    {
        super(mediator);
        this.name = name;
        // name of the boss

    }
    public void Send(String msg)
    {
        mediator.Send(this, msg);
    }
    public void Notify(String msg)
    {
        System.out.println("\nBoss sees message: " + msg);
        System.out.println("");
    }
}
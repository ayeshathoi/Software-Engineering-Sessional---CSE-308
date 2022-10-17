package BehaviouralDesignPattern.Mediator.Demo1;

abstract class Friend
{
    protected Mediator mediator;
    public String name;
    // Constructor
    public Friend(Mediator _mediator)
    {
        mediator = _mediator;
    }
}
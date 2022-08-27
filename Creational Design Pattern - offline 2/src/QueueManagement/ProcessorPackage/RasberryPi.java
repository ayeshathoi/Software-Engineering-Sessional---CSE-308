package QueueManagement.ProcessorPackage;

public class RasberryPi extends Processor
{

    public RasberryPi()
    {
        this.setRate(15);
        Call();
    }
    @Override
    public void Call()
    {
        System.out.println("Chosen Processor : Rasberrypi");
    }

}

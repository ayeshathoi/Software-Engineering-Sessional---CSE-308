package QueueManagement.DisplayPackage;

public class LED extends Display{
    public LED()
    {
        this.setRate(2);
        Call();

    }
    @Override
    public void Call()
    {
        System.out.println("Display System :LED Matrix");
    }
}

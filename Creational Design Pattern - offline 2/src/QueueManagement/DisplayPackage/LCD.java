package QueueManagement.DisplayPackage;

public class LCD extends Display{
    public LCD()
    {
        this.setRate(5);
        Call();

    }
    @Override
    public void Call()
    {
        System.out.println("Display System: LCD Panel");
    }

}

package QueueManagement.ProcessorPackage;

public class Atmega32 extends Processor {
    public Atmega32()
    {
        this.setRate(5);
        Call();
    }
    @Override
    public void Call()
    {
        System.out.println("Chosen Processor: Atmega32");
    }
}

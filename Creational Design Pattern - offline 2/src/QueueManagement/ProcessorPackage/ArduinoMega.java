package  QueueManagement.ProcessorPackage;

public class ArduinoMega extends Processor {
    public ArduinoMega()
    {
        this.setRate(10);
        Call();
    }
    @Override
    public void Call()
    {
        System.out.println("Chosen Processor: ArduinoMega");
    }

}

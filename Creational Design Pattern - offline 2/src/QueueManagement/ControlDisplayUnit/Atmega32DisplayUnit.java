package QueueManagement.ControlDisplayUnit;
import QueueManagement.ProcessorPackage.Atmega32;
import QueueManagement.ProcessorPackage.Processor;
import QueueManagement.DisplayPackage.Display;
import QueueManagement.DisplayPackage.LED;

public class Atmega32DisplayUnit implements DisplayUnitFactory {

    @Override
    public Processor getProcessor() {
        return new Atmega32();
    }

    @Override
    public Display getDisplay() {
        return new LED();
    }


}

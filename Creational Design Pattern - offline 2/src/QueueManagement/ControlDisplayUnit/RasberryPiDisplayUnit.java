package QueueManagement.ControlDisplayUnit;
import QueueManagement.ProcessorPackage.Processor;
import QueueManagement.DisplayPackage.Display;
import QueueManagement.DisplayPackage.LCD;
import QueueManagement.ProcessorPackage.RasberryPi;

public class RasberryPiDisplayUnit implements DisplayUnitFactory {

    @Override
    public Processor getProcessor() {
        return new RasberryPi();
    }

    @Override
    public Display getDisplay() {
        return new LCD();
    }

}

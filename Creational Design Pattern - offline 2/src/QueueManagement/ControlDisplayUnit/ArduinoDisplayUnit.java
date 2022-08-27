package QueueManagement.ControlDisplayUnit;

import QueueManagement.ProcessorPackage.Processor;
import QueueManagement.DisplayPackage.Display;
import QueueManagement.DisplayPackage.LED;
import QueueManagement.ProcessorPackage.ArduinoMega;

public class ArduinoDisplayUnit implements DisplayUnitFactory {

    @Override
    public Processor getProcessor() {
        return new ArduinoMega();
    }

    @Override
    public Display getDisplay() {
        return new LED();
    }



}

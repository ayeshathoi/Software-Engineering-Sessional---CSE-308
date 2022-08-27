package QueueManagement.ControlDisplayUnit;

import QueueManagement.DisplayPackage.Display;
import QueueManagement.ProcessorPackage.Processor;


public class DisplayUnit {
    private Display display;
    private Processor processor;


    public DisplayUnit(DisplayUnitFactory factory)
    {
        this.display = factory.getDisplay();
        this.processor = factory.getProcessor();
    }

    public Display getDisplay()
    {
        return display;
    }

    public  Processor getProcessor()
    {
        return processor;
    }

}

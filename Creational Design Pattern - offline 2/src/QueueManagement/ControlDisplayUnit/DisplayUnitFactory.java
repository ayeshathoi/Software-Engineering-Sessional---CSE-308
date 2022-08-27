package QueueManagement.ControlDisplayUnit;
import QueueManagement.ProcessorPackage.Processor;
import QueueManagement.DisplayPackage.Display;

public interface DisplayUnitFactory {

    public abstract Processor getProcessor();
    public abstract Display getDisplay();
}

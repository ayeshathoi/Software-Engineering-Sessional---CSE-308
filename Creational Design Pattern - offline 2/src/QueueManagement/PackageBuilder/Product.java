package  QueueManagement.PackageBuilder;
import QueueManagement.ControlDisplayUnit.DisplayUnit;
import QueueManagement.CommunicationPackage.CommunicationModule;

public class Product {

    private DisplayUnit displayUnit;
    private CommunicationModule communicationModule;

    public void setDisplayUnit(DisplayUnit displayUnit)
    {
        this.displayUnit = displayUnit;
    }

    public void setCommunicationModule(CommunicationModule communicationModule)
    {
        this.communicationModule = communicationModule;
    }
}

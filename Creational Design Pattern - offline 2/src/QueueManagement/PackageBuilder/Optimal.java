package  QueueManagement.PackageBuilder;
import QueueManagement.Application.ControlUnit;
import QueueManagement.ControlDisplayUnit.ArduinoDisplayUnit;
import QueueManagement.ControlDisplayUnit.DisplayUnit;
import QueueManagement.CommunicationPackage.CommunicationModule;
import QueueManagement.CommunicationPackage.CommunicationModuleFactory;

public class Optimal implements PackageFunctions {

    private Product product;
    private ControlUnit controlUnit ;
    private double price = 0;

    public Optimal()
    {
        product = new Product();

        controlUnit  = new ControlUnit();
    }

    @Override
    public void buildDisplayUnit(int DisplayNumber) {

        DisplayUnit displayUnit = new DisplayUnit(new ArduinoDisplayUnit());

        while(DisplayNumber!=0){

            controlUnit .addItems(displayUnit.getDisplay(), displayUnit.getProcessor());

            DisplayNumber--;

        }

        product.setDisplayUnit(displayUnit);
        price = controlUnit .getCost();

    }

    @Override
    public void BuildCommunication(String type) {
        CommunicationModule communicationModule = new CommunicationModuleFactory().getCommunicationModule(type);
        product.setCommunicationModule(communicationModule);
        communicationModule.CalculateModule();
        price+=communicationModule.CalculateModule();

    }

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public double getPrice() {
        return price;
    }

}

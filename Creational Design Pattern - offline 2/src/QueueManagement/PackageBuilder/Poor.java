package  QueueManagement.PackageBuilder;
import QueueManagement.Application.ControlUnit;
import QueueManagement.ControlDisplayUnit.Atmega32DisplayUnit;
import QueueManagement.ControlDisplayUnit.DisplayUnit;
import QueueManagement.CommunicationPackage.CommunicationModule;
import QueueManagement.CommunicationPackage.CommunicationModuleFactory;

public class Poor implements PackageFunctions {
    private Product product;
    private ControlUnit controlUnit;
    double price=0;
    public Poor()
    {
        product = new Product();
        controlUnit = new ControlUnit();

    }
    @Override
    public void buildDisplayUnit(int DisplayNumber) {

        DisplayUnit displayUnit = new DisplayUnit(new Atmega32DisplayUnit());

        while (DisplayNumber!=0){

            controlUnit.addItems(displayUnit.getDisplay(), displayUnit.getProcessor());
            DisplayNumber--;
        }

        product.setDisplayUnit(displayUnit);
        price=controlUnit.getCost();

    }

    @Override
    public void BuildCommunication(String type) {

        CommunicationModule communicationModule = new CommunicationModuleFactory().getCommunicationModule(type);
        product.setCommunicationModule(communicationModule);
        price+=communicationModule.CalculateModule();

    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public Product getProduct() {
        return product;
    }


}

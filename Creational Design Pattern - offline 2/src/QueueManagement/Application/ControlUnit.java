package QueueManagement.Application;
import QueueManagement.DisplayPackage.Display;
import QueueManagement.ProcessorPackage.Processor;
import java.util.ArrayList;
import java.util.List;

public class ControlUnit {

    private double Controller_price = 50;

    private List<Display> displayList = new ArrayList<>();

    private List<Processor> processorList = new ArrayList<>();


    public void addItems(Display display,Processor processor)
    {
        displayList.add(display);

        processorList.add(processor);

    }

    public double getCost()
    {
        double sum=0;
        for(Display display: displayList)
            sum+=display.getRate();
        for(Processor processor: processorList) {
            sum+=processor.getRate();
        }
        sum+= Controller_price;
        return sum;
    }

}

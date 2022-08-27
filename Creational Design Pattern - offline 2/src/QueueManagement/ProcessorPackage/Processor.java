package QueueManagement.ProcessorPackage;

public abstract class Processor
{
    private double rate ;

    public double getRate()
    {
        return rate;
    }

    public void setRate(double r)
    {
        this.rate = r;
    }

    public void Call() {

    }
}

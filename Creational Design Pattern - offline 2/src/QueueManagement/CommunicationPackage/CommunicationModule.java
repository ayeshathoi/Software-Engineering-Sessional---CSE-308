package QueueManagement.CommunicationPackage;

public abstract class CommunicationModule {

    private double rate;

    public double CalculateModule()
    {
        return rate;
    }

    public void setModuleRate(double r)

    {
        this.rate = r;
    }

    public void Call()
    {

    }
}

package QueueManagement.CommunicationPackage;

public class WifiModule extends CommunicationModule {

    public WifiModule()
    {
        this.setModuleRate(5);

    }
    @Override
    public void Call()
    {
        System.out.println("Communication Module : Wifi module");
    }
}

package QueueManagement.CommunicationPackage;

public class MobileSim extends CommunicationModule{

    public MobileSim()
    {
        this.setModuleRate(2);

        Call();
    }
    @Override
    public void Call()
    {
        System.out.println("Communication Module: Mobile Sim");
    }

}

package QueueManagement.CommunicationPackage;

public class CommunicationModuleFactory {

    public CommunicationModule getCommunicationModule(String type)
    {
        if(type.equalsIgnoreCase("Sim"))
             return new MobileSim();

        else if(type.equalsIgnoreCase("Wifi"))
            return  new WifiModule();

        return null;
    }

}

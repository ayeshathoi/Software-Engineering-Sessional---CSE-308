package QueueManagement.Application;

import QueueManagement.PackageBuilder.PackageBuilderFactory;
import QueueManagement.PackageBuilder.PackageFunctions;

public class ApplicationUnit {
    public double Total;
    public double serviceCharge;
    public int yearService;
    ApplicationUnit()
    {
        this.serviceCharge = 10;
        this.yearService = 1;
    }
    public void builder(String packagename, String module, int DisplayUnit, int Passedyear)
    {
        if(Passedyear>=1)
         this.yearService = Passedyear;
        if(packagename.equalsIgnoreCase("DELUXE")||
                packagename.equalsIgnoreCase("POOR")||packagename.equalsIgnoreCase("Optimal"))
        {
            PackageFunctions packageBuilder = PackageBuilderFactory.getPackage(packagename);
            packageBuilder.buildDisplayUnit(DisplayUnit);
            if (module.equalsIgnoreCase("SIM"))
                packageBuilder.BuildCommunication("Sim");
            else if(module.equalsIgnoreCase("WIFI"))
                packageBuilder.BuildCommunication("Wifi");
            Total = packageBuilder.getPrice();
            Total += serviceCharge * Passedyear;
        }
    }

    public double getTotal() {
        return Total;
    }
}

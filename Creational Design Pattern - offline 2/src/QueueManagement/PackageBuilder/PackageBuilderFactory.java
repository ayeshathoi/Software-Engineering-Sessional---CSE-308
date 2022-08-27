package  QueueManagement.PackageBuilder;

public class PackageBuilderFactory {

    public static PackageFunctions getPackage(String type)
    {

        if(type.equalsIgnoreCase("Poor"))
            return new Poor();
        else if(type.equalsIgnoreCase("Optimal"))
            return new Optimal();
        else if(type.equalsIgnoreCase("Deluxe"))
            return new DeluxePackage();
        return null;

    }

}


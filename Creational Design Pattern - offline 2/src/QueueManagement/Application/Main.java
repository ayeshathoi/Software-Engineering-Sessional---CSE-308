package QueueManagement.Application;
import java.util.Scanner;

public class Main {
    public static void main(String []args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("We have 3 package with 2 modules with Controller.\nController Price : 50$\n" +
                "Packages :\n"
        +"Deluxe : Processor -> RasberryPi  + Display : LCD. Price : 15$ + 5$\n"
                +"Optimal: Processor -> ArduinoMega + Display : LED. Price : 10$ + 2$\n"
                +"Poor   : Processor -> Atmega32    + Display : LED. Price : 5$  + 2$\n"
        +"Module:\n1.Mobile Sim module. Cost-> 2$\n"
        +"2.Wifi Module. Cost-> 5$\n"
        +"Service per year : 10$");




        System.out.print("Select Package from Deluxe, Poor & Optimal : \n");

        String  packageName = scanner.next();

        System.out.print("Select Internet Module from Mobile Sim Module & Wifi Module : \n");

        String ModuleName  = scanner.next();

        System.out.print("Select Number of DisplayUnit:\n" );

        int DisplayNumber = scanner.nextInt();

        if(DisplayNumber<=0) {
            System.out.println("Sorry,You have entered negative year or zero number of DisplayNumber\nwhich is invalid to us." +
                    " Please try again");
        }
            else{
            int year = scanner.nextInt();
            System.out.print("Enter how many years you want our service :\n" );
            if (year <= 0) {
                System.out.println("You have entered negative year or zero year which is invalid to us.\n" +
                        " Please try again");}
            else {

                try {
                    ApplicationUnit applicationUnit = new ApplicationUnit();
                    if (DisplayNumber > 0 && year > 0) {
                        System.out.println("Congratulations. You have taken " + year + " year subscription of our package.");
                        applicationUnit.builder(packageName, ModuleName, DisplayNumber, year);
                        System.out.println("Your total cost : " + applicationUnit.getTotal());
                    }
                } catch (Exception e) {
                    System.out.println("You have taken wrong input.");
                }
            }
        }

    }
}

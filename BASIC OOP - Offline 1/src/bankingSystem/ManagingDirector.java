package bankingSystem;

public class ManagingDirector extends Officer
{

    public ManagingDirector(String name,String type)
    {
        super(name,type);
    }

    static void see()
    {
        System.out.println("Bank's internal Fund " + BankingSystem.fund);
    }

    static void LookUp(String name){
        Cashier.LookUp(name);
    }

    static void Change(String name,double interest)
    {
        for(int i=0;i<BankingSystem.allAccounts.size();i++)
        {
            if(name.equalsIgnoreCase(BankingSystem.allAccounts.get(i).getAccType())) {
                BankingSystem.allAccounts.get(i).setInterest(interest);
                System.out.println(BankingSystem.allAccounts.get(i).getAccType()+"'s interest has changed to "+interest);
            }
        }
    }




}

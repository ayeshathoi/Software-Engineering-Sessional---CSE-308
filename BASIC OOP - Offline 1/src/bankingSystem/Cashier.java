package bankingSystem;

public class Cashier{
    protected String emName;
    protected String empType;

    public Cashier(String name,String type)
    {
        this.emName = name;
        this.empType = type;
    }

    static void LookUp(String name){
        for(int i=0;i<BankingSystem.allAccounts.size();i++){
            if(name.equals(BankingSystem.allAccounts.get(i).name)){
                System.out.println(name+"'s current balance "+BankingSystem.allAccounts.get(i).balance+"$");
            }
        }
    }
}

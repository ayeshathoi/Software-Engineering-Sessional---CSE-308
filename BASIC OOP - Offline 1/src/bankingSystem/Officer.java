package bankingSystem;

public class Officer extends Cashier {

    public Officer(String name,String type)
    {
        super(name,type);
    }

    static void appLoan(){
        for (int i = 0;i<BankingSystem.allAccounts.size();i++)
            {
                double amountOfMoney=BankingSystem.allAccounts.get(i).unaprovedloan;
                if(amountOfMoney!=0)
                {if(BankingSystem.allAccounts.get(i).ReqLoan(amountOfMoney)) {
                    System.out.println("Loan for " + BankingSystem.allAccounts.get(i).name + " approved");
                }
         }
        }
    }


}

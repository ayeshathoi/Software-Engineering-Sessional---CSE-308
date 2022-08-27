package bankingSystem;

public class LoanBankAccount extends BankAccount{

    public LoanBankAccount(String name, String accType, double balance) {
        super(name,accType,0);
        this.loan = balance;
    }

    @Override
    public boolean deposit(double amountOfMoney){
        if(amountOfMoney<=0){
            System.err.println("invalid amount");
            return false;
        }
        loan-=amountOfMoney;
        BankingSystem.fund +=amountOfMoney;
        return true;
    }

    @Override
    public boolean ReqLoan(double money)
    {
        maxloan = loan*.05;
        if(money>=0 && money<maxloan){
            return false;
        }
        loan+=money;
        BankingSystem.fund -=money;
        setLoan(loan);
        return true;
    }
}

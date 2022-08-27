package bankingSystem;

public class StudentBankAccount extends BankAccount{
    protected int maxloan;

    public StudentBankAccount(String name, String accType,double balance) {
        super(name, accType, balance);
        maxloan = 1000;
        this.interest=.05;
    }


    @Override
    public boolean withdraw(double amountOfMoney)
    {
        if(amountOfMoney<=10000){
            balance-=amountOfMoney;
            return true;
        }
        return false;
    }
}

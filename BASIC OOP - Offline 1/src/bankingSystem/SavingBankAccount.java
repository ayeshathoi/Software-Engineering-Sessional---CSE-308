package bankingSystem;

public class SavingBankAccount extends BankAccount{
    private double minbalance;

    public SavingBankAccount(String name,String accType, double balance) {
        super(name, accType, balance);
        minbalance = 1000;
        this.interest = .1;

    }

    @Override
    public boolean withdraw(double amountOfMoney)
    {
        if(balance-amountOfMoney>=minbalance){
            balance-=amountOfMoney;
            return true;
        }
        System.err.println("Bank balance must have 1000$ if withdraw.");
        return false;
    }
}

package bankingSystem;

public class FixedDepotBankAccount extends BankAccount
{
    private double minimumBalance;
    private int minyear;

    public FixedDepotBankAccount(String name, String accType, double balance){
        super(name,accType,balance);
        minimumBalance=50000;
        minyear = 1;
        this.interest=.15;
    }

    public int getMinyear() {
        return minyear;
    }

    public void setMinyear(int minyear) {
        this.minyear = minyear;
    }

    @Override
    public boolean withdraw(double amountOfMoney)
    {
        if(minyear>=1){
            balance-=amountOfMoney;
            return true;
        }
        System.err.println("1 year is not passed");
        return false;
    }




    @Override
    public boolean deposit(double amountOfMoney)
    {
        if(amountOfMoney<500000){
            System.err.println("Deposit 500000$ every deposit time.");
            return false;
        }
        balance+=amountOfMoney;
        return true;
    }
}
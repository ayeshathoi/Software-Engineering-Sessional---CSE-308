package bankingSystem;

public class BankAccount
{
    protected double balance;
    protected String name;
    protected double unaprovedloan;
    protected String accType;
    protected int BankYear;
    protected double loan;
    protected double intloan;
    protected double interest;
    static double maxloan;

    public BankAccount(String name,String accType,double balance){
        this.name=name;
        this.accType = accType;
        this.balance=balance;
        this.intloan = .1;
        this.BankYear=0;
        this.loan = 0;
        this.unaprovedloan = 0;
        System.out.println(accType+" account for "+name+" Created;initial balance "+balance+"$\n");

    }

    public double getUnaprovedloan() {
        return unaprovedloan;
    }

    public void setUnaprovedloan(double unaprovedloan) {
        this.unaprovedloan = unaprovedloan;
    }

    public String getAccType() {
        return accType;
    }


    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getLoan() {
        return loan;
    }


    public void setBankYear() {
        this.BankYear+=1;
    
        if(balance>0) {
            double sub = (balance) * interest;
            balance += sub;
            BankingSystem.fund -= sub;
            balance-=500;
            sum = loan*intloan;
            balance -=sum;
            BankingSystem.fund+=sum;
        }

        if(balance<0)
        {
            balance-=500;
            sum = loan*intloan;
            balance -=sum;
            BankingSystem.fund+=sum;
            loan +=-balance;
            balance=0;
        }


    }


    public void setLoan(double loan) {
        this.loan = loan;
    }


    public double getBalance()
    {
        return balance;
    }
    public String getName()
    {
        return name;
    }

    public boolean withdraw(double amountOfMoney){
    
        if(amountOfMoney<0){
            System.err.println("invalid amount");
            return false;
        }
        if(amountOfMoney>balance){
            System.err.println("Insufficient balance");
            return false;
        }
        balance-=amountOfMoney;
        BankingSystem.fund -=amountOfMoney;
        return true;
    }

    public boolean deposit(double amountOfMoney){
        if(amountOfMoney<=0){
            System.err.println("invalid amount");
            return false;
        }
        balance+=amountOfMoney;
        BankingSystem.fund +=amountOfMoney;
        return true;
    }

    public boolean ReqLoan(double money)
    {
        if(money<=0 && money>maxloan){
            System.err.println("invalid amount or you can't take this much money");
            return false;
        }
        balance+=money;
        setLoan(money);
        BankingSystem.fund -=money;
        return true;
    }

}
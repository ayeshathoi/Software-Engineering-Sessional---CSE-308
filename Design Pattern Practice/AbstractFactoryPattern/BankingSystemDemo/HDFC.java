package CreationalDesignPattern.AbstractFactoryPattern.BankingSystemDemo;

public class HDFC implements Bank{
    private final String BNAME;
    public HDFC(){
        BNAME="HDFC BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}
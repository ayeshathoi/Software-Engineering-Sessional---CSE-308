package bankingSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BankingSystem {

    static ArrayList<BankAccount> allAccounts;
    static ArrayList<Cashier> AllEmployee;
    static Scanner input;
    static double fund;

    public double getFund() {
        return fund;
    }

    public BankingSystem() {
        this.fund = 100000;
        AllEmployee = new ArrayList<>();
        ManagingDirector MD = new ManagingDirector("MD", "MD");
        AllEmployee.add(MD);
        Officer O1 = new Officer("O1", "Officer");
        AllEmployee.add(O1);

        Officer O2 = new Officer("O2", "Officer");
        AllEmployee.add(O2);
        Cashier C1 = new Cashier("C1", "Cashier");
        AllEmployee.add(C1);

        Cashier C2 = new Cashier("C2", "Cashier");
        AllEmployee.add(C2);
        Cashier C3 = new Cashier("C3", "Cashier");
        AllEmployee.add(C3);
        Cashier C4 = new Cashier("C4", "Cashier");
        AllEmployee.add(C4);
        Cashier C5 = new Cashier("C5", "Cashier");
        AllEmployee.add(C5);

        System.out.println("Bank Created; MD, O1, O2, C1, C2, C3, C4, C5 created");
    }

    static int searchEmployer(String accname) {
        for (int i = 0; i < AllEmployee.size(); i++) {
            if (accname.equals(AllEmployee.get(i).emName)) {
                return i;
            }
        }
        return -1;
    }


    static int searchAccountHolder(String accname) {
        for (int i = 0; i < allAccounts.size(); i++) {
            if (accname.equals(allAccounts.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    static void Query(String name) {
        int acc = searchAccountHolder(name);
        if (acc == -1) {
            System.err.println("account not found");
            return;
        }
        System.out.println("Current balance " + allAccounts.get(acc).getBalance());
        if (allAccounts.get(acc).getLoan() != 0)
            System.out.println("Loan " + allAccounts.get(acc).getLoan());
    }

    static void deposit(String name, double amountOfMoney) {

        int index = searchAccountHolder(name);
        if (index == -1) {
            System.err.println("account not found");
            return;
        }

        if (allAccounts.get(index).deposit(amountOfMoney)) {
            double balance = allAccounts.get(index).getBalance();
            System.out.println(amountOfMoney + "$ deposited; current balance " + balance + "$");
        }
    }

    static void reqLoan(String name, double amountOfMoney) {
        int index = searchAccountHolder(name);
        if (index == -1) {
            System.err.println("account not found");
            return;
        }
        if (amountOfMoney <= BankingSystem.fund) {
            allAccounts.get(index).unaprovedloan = amountOfMoney;
            if(BankAccount.maxloan!=0)
                System.out.println("Loan request successful, sent for approval");
            else System.out.println("Invalid Requested Loan Amount ");
        }

    }

    static void withdraw(String name, double amountOfMoney) {
        int index = searchAccountHolder(name);
        if (index == -1) {
            System.err.println("account not found");
            return;
        }
        double balance = allAccounts.get(index).getBalance();
        if (allAccounts.get(index).withdraw(amountOfMoney)) {
            System.out.println("successful operation");
        } else System.out.println("Invalid transaction; current balance " + balance + "$");
    }

    static void INC() {
        System.out.println(allAccounts.get(0).BankYear + " year passed for Bank");
        for (int i = 0; i < BankingSystem.allAccounts.size(); i++)
            {allAccounts.get(i).setBankYear();
            System.out.println(allAccounts.get(i).BankYear + " year passed for "+allAccounts.get(i).name);

            }
        

    }


    static void addAccount(String name, String accType, double balance) {
        int check = searchAccountHolder(name);
        if (check != -1) {
            System.out.println("This name is already Taken");
            return;
        }
        BankAccount newAccount = null;

        if (accType.equalsIgnoreCase("Student")) {
            newAccount = new StudentBankAccount(name, accType, balance);
        } else if (accType.equalsIgnoreCase("Fixed Deposit")) {
            if (balance >= 100000) {
                newAccount = new FixedDepotBankAccount(name, accType, balance);
            } else System.out.println("You don't have sufficient balance");
        } else if (accType.equalsIgnoreCase("Loan")) {
            newAccount = new LoanBankAccount(name, accType, balance);
        } else if (accType.equalsIgnoreCase("Savings")) {
            newAccount = new SavingBankAccount(name, accType, balance);
        } else System.out.println("You gave wrong type of bankAccount");
        allAccounts.add(newAccount);


    }

    public static void main(String[] args) throws FileNotFoundException {
        BankingSystem bank = new BankingSystem();
        allAccounts = new ArrayList<BankAccount>();

        input = new Scanner(new File("src\\in.txt"));

        while (input.hasNext()) {
            String op = input.next();
            if (op.equalsIgnoreCase("INC")) {
                INC();
            }
            if (op.equalsIgnoreCase("Create") || op.equalsIgnoreCase("Open")) {
                String name = input.next();
                int i = searchAccountHolder(name);
                int j = searchEmployer(name);
                if (op.equalsIgnoreCase("Create") || op.equalsIgnoreCase("Open") && i != -1) {
                    if (op.equalsIgnoreCase("Create")) {
                        String accType = input.next();
                        double balance = input.nextDouble();
                        addAccount(name, accType, balance);
                    }
                    if (op.equalsIgnoreCase("Open") && i != -1) {
                        System.out.println("Welcome Back " + allAccounts.get(i).name);
                    }
                    while (input.hasNext()) {

                        String opnext = input.next();
                        if (opnext.equalsIgnoreCase("Query"))
                            Query(name);
                        else if (opnext.equalsIgnoreCase("Deposit")) {
                            double money = input.nextDouble();
                            deposit(name, money);
                        } else if (opnext.equalsIgnoreCase("Request")) {
                            double money = input.nextDouble();
                            reqLoan(name, money);
                        } else if (opnext.equalsIgnoreCase("Withdraw")) {
                            double money = input.nextDouble();
                            withdraw(name, money);
                        } else if (opnext.equalsIgnoreCase("Close")) {
                            System.out.println("Transaction Closed for " + name);
                            break;
                        } else System.out.println("You are not allowed to do this operation.");
                    }
                }
                if (op.equalsIgnoreCase("Open") && j != -1) {
                    System.out.println(AllEmployee.get(j).emName + " Active");
                    int flag =0;
                    for (int r=0;r<allAccounts.size();r++)
                    {
                        if(allAccounts.get(r).unaprovedloan!=0)
                            flag=1;
                    }
                    if (flag==1)
                     System.out.println("There are loan approvals pending");
                    while (true) {
                        String s = AllEmployee.get(j).empType;

                        String op1 = input.next();
                        if (op1.equalsIgnoreCase("LookUp")) {
                            String l = input.next();
                            Cashier.LookUp(l);
                        } else if (op1.equalsIgnoreCase("See") && s.equalsIgnoreCase("MD"))
                            ManagingDirector.see();

                        else if (op1.equalsIgnoreCase("Approve")
                                && s.equalsIgnoreCase("MD") ||
                                op1.equalsIgnoreCase("Approve")
                                        && s.equalsIgnoreCase("Officer")) {
                            String r = input.next();
                            if (r.equalsIgnoreCase("Loan"))
                                Officer.appLoan();
                        } else if (op1.equalsIgnoreCase("Change")) {
                            String accType = input.next();
                            double in = input.nextDouble();
                            if(s.equalsIgnoreCase("MD"))
                                ManagingDirector.Change(accType, in);
                            else System.out.println("You are not allowed to do this operation.");
                        } else if (op1.equalsIgnoreCase("Close")) {
                            System.out.println("Operations for " + name + " closed\n ");
                            break;
                        } else System.out.println("You are not allowed to do this operation.");

                    }
                }


            }
        }
    }
}


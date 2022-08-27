package CalculatorSum.Client;


import CalculatorSum.SumCalculatorAdapter.SumAdapter;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        try{
            System.out.println("Sum = "+new SumAdapter().CalculateDecimal(new File("src/CalculatorSum/Client/input.txt")));

        }catch (Exception exception){
            System.out.println(exception + "Occured");
        }

    }
}
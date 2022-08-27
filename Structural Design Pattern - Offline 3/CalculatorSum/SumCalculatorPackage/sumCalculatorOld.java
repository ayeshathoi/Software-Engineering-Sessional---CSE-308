package CalculatorSum.SumCalculatorPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sumCalculatorOld {

    double sum = 0;

    public double calculateSumOld(File decimalFile) throws FileNotFoundException{

        Scanner scanner = new Scanner(decimalFile);
        while(scanner.hasNextDouble()){
            sum += scanner.nextDouble();
        }

        return sum;
    }
}
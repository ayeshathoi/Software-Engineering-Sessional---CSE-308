package CalculatorSum.SumCalculatorAdapter;
import CalculatorSum.SumCalculatorPackage.sumCalculatorOld;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class SumAdapter {

    private sumCalculatorOld sumCalculatorOld  = new sumCalculatorOld(); ;

    public SumAdapter()
    {

    }


    public double CalculateDecimal(File file) throws Exception{
        File DecimalInput = new File("src/CalculatorSum/Client/DecimalSeparation.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String charInput = br.readLine();

        FileWriter fileWriter = new FileWriter(DecimalInput);


        String [] numbers = charInput.split("~");

        for(int i=0;i<numbers.length;i++){

            fileWriter.write((numbers[i]) + " ");
        }

        fileWriter.close();

        double sum = sumCalculatorOld.calculateSumOld(DecimalInput);

        DecimalInput.delete();

        return sum;
    }

}
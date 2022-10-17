package BehaviouralDesignPattern.Observer.Demo3.Test;

import BehaviouralDesignPattern.Observer.Demo3.Stock.StockMarket;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        stockMarket.readStockFile(new File("src/BehaviouralDesignPattern/Observer/Demo3/test/input.txt"));
        System.out.println(stockMarket);
    }
}

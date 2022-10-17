package CreationalDesignPattern.BuilderExample.CDBuilderDemo;

import java.util.ArrayList;
import java.util.List;

public class CDTYPE {
    private List<Packing> items =new ArrayList<>();
    public void addItems(Packing pack)
    {
        items.add(pack);
    }
   public int getCost()
    {
        int sum=0;
        for(Packing pack : items)
            sum+=pack.cost();
        return sum;
    }
    public void showItems()
    {
        for(Packing pack : items) {
            System.out.println(pack.pack());
            System.out.println(pack.cost());
           // System.out.println(items.size());
        }
    }
}

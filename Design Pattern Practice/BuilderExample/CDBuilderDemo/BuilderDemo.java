package CreationalDesignPattern.BuilderExample.CDBuilderDemo;

public class BuilderDemo {
    public static void main(String []args)
    {
        CDBUILDER cdbuilder = new CDBUILDER();
        CDTYPE cdtype1 = cdbuilder.buildSony();
        cdtype1.showItems();
        cdtype1.addItems(new Samsung());
        cdtype1.showItems();
        System.out.println(cdtype1.getCost());



    }
}

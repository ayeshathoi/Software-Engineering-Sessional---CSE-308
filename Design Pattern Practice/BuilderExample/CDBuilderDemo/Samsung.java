package CreationalDesignPattern.BuilderExample.CDBuilderDemo;



public class Samsung extends Company {
    @Override
    public String pack() {
        return "SAMSUNG TV";
    }

    @Override
    public int cost() {
        return 10;
    }
}

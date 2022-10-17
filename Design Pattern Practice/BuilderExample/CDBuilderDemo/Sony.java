package CreationalDesignPattern.BuilderExample.CDBuilderDemo;

import CreationalDesignPattern.BuilderExample.CDBuilderDemo.Company;

public class Sony extends Company {
    @Override
    public String pack() {
        return "SONY TV";
    }

    @Override
    public int cost() {
        return 20;
    }
}

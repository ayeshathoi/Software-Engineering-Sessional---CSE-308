package CreationalDesignPattern.BuilderExample.CDBuilderDemo;

public class CDBUILDER {
    public CDTYPE buildSony()
    {
        CDTYPE cd = new CDTYPE();
        cd.addItems(new Sony());
        return cd;
    }

    public CDTYPE buildSamsung()
    {
        CDTYPE cd = new CDTYPE();
        cd.addItems(new Samsung());
        return cd;
    }
}

package ProgrammingLanguageEditor.Editor;

public class EnvironmentFactory {
    public static Environment getFactory(String type)
    {
        if(type.equalsIgnoreCase("cpp"))
            return new CPP_Factory();

        else if(type.equalsIgnoreCase("c"))
            return new C_Factory();

        else if(type.equalsIgnoreCase("py"))
            return new Py_Factory();

        return null;
    }
}

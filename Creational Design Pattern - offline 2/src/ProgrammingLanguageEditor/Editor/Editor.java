package ProgrammingLanguageEditor.Editor;

import ProgrammingLanguageEditor.FontPackage.Font;
import ProgrammingLanguageEditor.Language.Language;
import ProgrammingLanguageEditor.Parser.Parser;

public class Editor {

    private static Editor instance = null;
    private String environment;
    private Font font;
    private Parser parser;
    private Language language;
    private Environment Editor;

    public Editor()
    {

    }

    public static Editor getEditor(){
        if(instance == null)
            return new Editor();
        return instance;
    }

    public void InputFile(String filename) {
        int index = 0;
        int end = filename.length();
        for (int i = end - 1; i != 0; i--) {
            if (filename.charAt(i) == '.') {
                index = i + 1;
                break;
            }
        }

        environment = filename.substring(index, end);

        try {
            Editor = EnvironmentFactory.getFactory(environment);
            if(Editor!=null)
                System.out.println("Your File " + filename +
                     " has opened");
        }catch (Exception e)
        {
            System.out.println("Language/Environment has not matched");
        }
    }
    public boolean getEnvironment()
    {
        if(Editor!=null)
        {

            this.language = Editor.getLanguage();
            return true;
        }
        return false;
    }
    public void getParser()
    {
        this.parser = Editor.getParser();
    }
    public void getFont()
    {
        this.font = Editor.getFont();
    }

}

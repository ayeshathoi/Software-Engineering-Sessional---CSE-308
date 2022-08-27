package ProgrammingLanguageEditor.Editor;
import ProgrammingLanguageEditor.FontPackage.Consolas;
import ProgrammingLanguageEditor.FontPackage.Font;
import ProgrammingLanguageEditor.Language.Language;
import ProgrammingLanguageEditor.Language.Python;
import ProgrammingLanguageEditor.Parser.Parser;
import ProgrammingLanguageEditor.Parser.pythonParser;

public class Py_Factory implements Environment
{
    @Override
    public Font getFont()
    {
        return new Consolas();
    }

    @Override
    public Language getLanguage() {
        return new Python();
    }
    @Override
    public Parser getParser()
    {
        return new pythonParser();
    }
}

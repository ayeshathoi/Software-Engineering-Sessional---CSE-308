package ProgrammingLanguageEditor.Editor;
import ProgrammingLanguageEditor.FontPackage.Font;
import ProgrammingLanguageEditor.FontPackage.Monaco;
import ProgrammingLanguageEditor.Language.CPP;
import ProgrammingLanguageEditor.Language.Language;
import ProgrammingLanguageEditor.Parser.Parser;
import ProgrammingLanguageEditor.Parser.cppParser;

public class CPP_Factory implements Environment
{
    @Override
    public Font getFont() {
        return new Monaco();
    }
    @Override
    public Language getLanguage() {
        return new CPP();
    }
    @Override
    public Parser getParser() {
        return new cppParser();
    }
}

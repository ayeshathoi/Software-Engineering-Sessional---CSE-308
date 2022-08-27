package ProgrammingLanguageEditor.Editor;

import ProgrammingLanguageEditor.FontPackage.CourierNew;
import ProgrammingLanguageEditor.FontPackage.Font;
import ProgrammingLanguageEditor.Language.C;
import ProgrammingLanguageEditor.Language.Language;
import ProgrammingLanguageEditor.Parser.CParser;
import ProgrammingLanguageEditor.Parser.Parser;

public class C_Factory implements Environment {
    @Override
    public Font getFont() {
        CourierNew c = new CourierNew();
        return c;
    }

    @Override
    public Language getLanguage() {
        return new C();
    }

    @Override
    public Parser getParser() {
        return new CParser();
    }
}

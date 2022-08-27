package ProgrammingLanguageEditor.Editor;

import ProgrammingLanguageEditor.FontPackage.Font;
import ProgrammingLanguageEditor.Language.Language;
import ProgrammingLanguageEditor.Parser.Parser;

public interface Environment {
    Font getFont();
    Language getLanguage();
    Parser getParser();
}

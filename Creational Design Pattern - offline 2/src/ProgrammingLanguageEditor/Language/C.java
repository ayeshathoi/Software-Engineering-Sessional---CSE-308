package ProgrammingLanguageEditor.Language;

public class C implements Language {
    public C()
    {
        Call();
    }

    @Override
    public void Call() {
        System.out.println("Language/Environment: C");
    }
}

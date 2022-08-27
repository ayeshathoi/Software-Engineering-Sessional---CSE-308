package ProgrammingLanguageEditor.Editor;

import java.util.Scanner;

public class Main
{
    public static void main (String[] args) {
        Editor editor = Editor.getEditor();

        try {

            while(true)
            {
                System.out.println ("Press 1 to Input filename or anything to exit");
                Scanner sc = new Scanner(System.in);
                if(sc.nextInt()==1) {
                    System.out.println("Enter Filename: ");
                    editor.InputFile(sc.next());
                    editor.getEnvironment();
                    editor.getParser();
                    editor.getFont();

                    }
                else break;

                }
        }catch (Exception e)
        {
            System.out.println("Input mismatched");

        }
    }
}

package UnitTesting.OfflineUnitTesting;

public class Credit4GradeCalculator extends GradeCalculator{

    private static float marks;
    //Highest & Lowest Marks
    private static int LOWEST_MARKS = 0;
    private static int HIGHEST_MARKS = 400;


    //Error Messages for inappropriates inputs
    static String NEGATIVE_MARKS = "NEGATIVE NUMBER NOT ALLOWED";
    static String UPPER_MARKS = "ABOVE UPPER BOUND 400 NOT ALLOWED";
    static String NON_NUMBER = "NON NUMBER INPUT, ONLY NUMBER FROM 0 TO 400 ALLOWED";

    static String GRADE_A = "A";
    static String GRADE_B = "B";
    static String GRADE_C = "C";
    static String GRADE_F = "F";

    Credit4GradeCalculator()
    {

    }

    public String calculateGrade(String marksCreditFour){
        try{
            marks =Float.parseFloat(marksCreditFour);
        }catch(Exception e){
            return NON_NUMBER;
        }

        if(marks> HIGHEST_MARKS) {
            return UPPER_MARKS;
        }
        if(marks< LOWEST_MARKS) {
            return NEGATIVE_MARKS;
        }

        int CREDIT_4_A_MAX = 400;
        int CREDIT_4_A_MIN = 320;
        int CREDIT_4_B_MAX = 319;
        int CREDIT_4_B_MIN = 280;
        int CREDIT_4_C_MAX = 279;
        int CREDIT_4_C_MIN = 240;

        if(marks - (int)marks>0) {
            marks = (int) marks;
            marks++;
        }

        if(marks>= CREDIT_4_A_MIN && marks<= CREDIT_4_A_MAX)
            return GRADE_A;
        else if(marks>= CREDIT_4_B_MIN && marks<= CREDIT_4_B_MAX)
            return GRADE_B;
        else if (marks>= CREDIT_4_C_MIN && marks<= CREDIT_4_C_MAX)
            return GRADE_C;

        else return GRADE_F;
    }
}

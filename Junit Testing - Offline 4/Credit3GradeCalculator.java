package UnitTesting.OfflineUnitTesting;

public class Credit3GradeCalculator extends GradeCalculator{

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
    //GRADES

    Credit3GradeCalculator()
    {

    }

    public String calculateGrade(String marksCrditThree){

        try{
            marks =Float.parseFloat(marksCrditThree);
        }catch(Exception e){
            return NON_NUMBER;
        }
        if(marks> HIGHEST_MARKS) {
            return UPPER_MARKS;
        }

        if(marks< LOWEST_MARKS) {
            return NEGATIVE_MARKS;
        }

        if(marks - (int)marks>0) {
            marks = (int) marks;
            marks++;
        }


        int CREDIT_3_C_MIN = 180;
        int CREDIT_3_C_MAX = 209;
        int CREDIT_3_B_MIN = 210;
        int CREDIT_3_B_MAX = 239;
        int CREDIT_3_A_MIN = 240;
        int CREDIT_3_A_MAX = 400;


        if(marks>= CREDIT_3_A_MIN && marks<= CREDIT_3_A_MAX)
            return GRADE_A;

        else if(marks>= CREDIT_3_B_MIN && marks<= CREDIT_3_B_MAX)
            return GRADE_B;

        else if(marks>= CREDIT_3_C_MIN && marks<= CREDIT_3_C_MAX)
            return GRADE_C;

        else return GRADE_F;
    }
}

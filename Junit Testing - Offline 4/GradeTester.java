package UnitTesting.OfflineUnitTesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class GradeTester {

    Credit3GradeCalculator credit3GradeCalculator;
    Credit4GradeCalculator credit4GradeCalculator;
    
    static String GRADE_A = "A";
    static String GRADE_B = "B";
    static String GRADE_C = "C";
    static String GRADE_F = "F";

    @Before
    public void setGradeCalculator()
    {
        credit3GradeCalculator = new Credit3GradeCalculator();
        credit4GradeCalculator = new Credit4GradeCalculator();

    }

    @Test
    @DisplayName("GRADE A TEST FOR CREDIT 3 : INTEGER, Value = 240 ")
    public void gradeA_3_low(){
        assertEquals(GRADE_A,credit3GradeCalculator.calculateGrade("240"));
    }

    @Test
    @DisplayName("GRADE A TEST FOR CREDIT 3 : INTEGER, Value = 300 ")
    public void gradeA_3_mid(){
        assertEquals(GRADE_A,credit3GradeCalculator.calculateGrade("300"));
    }

    @Test
    @DisplayName("GRADE A TEST FOR CREDIT 3 : INTEGER, Value = 400 ")
    public void gradeA_3_high(){
        assertEquals(GRADE_A,credit3GradeCalculator.calculateGrade("400"));
    }

    @Test
    @DisplayName("GRADE B TEST FOR CREDIT 3 : INTEGER, Value = 210 ")
    public void gradeB_3_low(){
        assertEquals(GRADE_B, credit3GradeCalculator.calculateGrade("210"));
    }

    @Test
    @DisplayName("GRADE B TEST FOR CREDIT 3 : INTEGER, Value = 220 ")
    public void gradeB_3_mid(){
        assertEquals(GRADE_B, credit3GradeCalculator.calculateGrade("220"));
    }

    @Test
    @DisplayName("GRADE B TEST FOR CREDIT 3 : INTEGER, Value = 239 ")
    public void gradeB_3_high(){
        assertEquals(GRADE_B, credit3GradeCalculator.calculateGrade("239"));
    }

    @Test
    @DisplayName("GRADE C TEST FOR CREDIT 3 : INTEGER , Value = 180 ")
    public void gradeC_3_low(){
        assertEquals(GRADE_C, credit3GradeCalculator.calculateGrade("180"));
    }

    @Test
    @DisplayName("GRADE C TEST FOR CREDIT 3 : INTEGER , Value = 200 ")
    public void gradeC_3_mid(){
        assertEquals(GRADE_C, credit3GradeCalculator.calculateGrade("200"));
    }

    @Test
    @DisplayName("GRADE C TEST FOR CREDIT 3 : INTEGER , Value = 209 ")
    public void gradeC_3_high(){
        assertEquals(GRADE_C, credit3GradeCalculator.calculateGrade("209"));}

    @Test
    @DisplayName("GRADE F TEST FOR CREDIT 3 : INTEGER, Value = 179 ")
    public void gradeF_3_high(){
        assertEquals(GRADE_F, credit3GradeCalculator.calculateGrade("179"));
    }

    @Test
    @DisplayName("GRADE F TEST FOR CREDIT 3 : INTEGER, Value = 0 ")
    public void gradeF_3_low(){
        assertEquals(GRADE_F, credit3GradeCalculator.calculateGrade("0"));
    }


    @Test
    @DisplayName("GRADE A TEST FOR CREDIT 4 : INTEGER, Value = 320")
    public void gradeA_4_low(){
        assertEquals(GRADE_A, credit3GradeCalculator.calculateGrade("320"));
    }

    @Test
    @DisplayName("GRADE A TEST FOR CREDIT 4 : INTEGER, Value = 360")
    public void gradeA_4_mid(){
        assertEquals(GRADE_A, credit3GradeCalculator.calculateGrade("360"));
    }

    @Test
    @DisplayName("GRADE A TEST FOR CREDIT 4 : INTEGER, Value = 400")
    public void gradeA_4_high(){
        assertEquals(GRADE_A, credit3GradeCalculator.calculateGrade("400"));
    }

    @Test
    @DisplayName("GRADE B TEST FOR CREDIT 4 : INTEGER, Value = 280 ")
    public void gradeB_4_low(){
        assertEquals(GRADE_B, credit4GradeCalculator.calculateGrade("280"));
    }

    @Test
    @DisplayName("GRADE B TEST FOR CREDIT 4 : INTEGER, Value = 300 ")
    public void gradeB_4_mid(){
        assertEquals(GRADE_B, credit4GradeCalculator.calculateGrade("300"));
    }

    @Test
    @DisplayName("GRADE B TEST FOR CREDIT 4 : INTEGER, Value = 319 ")
    public void gradeB_4(){
        assertEquals(GRADE_B, credit4GradeCalculator.calculateGrade("319"));
    }

    @Test
    @DisplayName("GRADE C TEST FOR CREDIT 4 : INTEGER, Value = 240 ")
    public void gradeC_4_low(){
        assertEquals(GRADE_C, credit4GradeCalculator.calculateGrade("240"));
    }

    @Test
    @DisplayName("GRADE C TEST FOR CREDIT 4 : INTEGER, Value = 250 ")
    public void gradeC_4_mid(){
        assertEquals(GRADE_C, credit4GradeCalculator.calculateGrade("250"));
    }

    @Test
    @DisplayName("GRADE C TEST FOR CREDIT 4 : INTEGER, Value = 279 ")
    public void gradeC_4_high(){
        assertEquals(GRADE_C, credit4GradeCalculator.calculateGrade("279"));
    }

    @Test
    @DisplayName("GRADE F TEST FOR CREDIT 4 : INTEGER, Value = 239 ")
    public void gradeF_4_high(){
        assertEquals(GRADE_F, credit4GradeCalculator.calculateGrade("239"));
    }

    @Test
    @DisplayName("GRADE F TEST FOR CREDIT 4 : INTEGER, Value = 0 ")
    public void gradeF_4_low(){
        assertEquals(GRADE_F, credit4GradeCalculator.calculateGrade("0"));
    }

    @Test
    @DisplayName("GRADE A TEST FOR CREDIT 3 : FLOAT, Value = 239.1")
    public void gradeA_NOTROUND_3_low(){
        assertEquals(GRADE_A, credit3GradeCalculator.calculateGrade("239.1"));
    }

    @Test
    @DisplayName("GRADE A TEST FOR CREDIT 3 : FLOAT, Value = 239.9")
    public void gradeA_NOTROUND_3_high(){
        assertEquals(GRADE_A, credit3GradeCalculator.calculateGrade("239.9"));
    }

    @Test
    @DisplayName("GRADE B TEST FOR CREDIT 3 : FLOAT, Value = 209.1 ")
    public void gradeB_NOTROUND_3_low(){
        assertEquals(GRADE_B, credit3GradeCalculator.calculateGrade("209.1"));
    }

    @Test
    @DisplayName("GRADE B TEST FOR CREDIT 3 : FLOAT, Value = 209.9 ")
    public void gradeB_NOTROUND_3_high(){
        assertEquals(GRADE_B, credit3GradeCalculator.calculateGrade("209.1"));
    }

    @Test
    @DisplayName("GRADE C TEST FOR CREDIT 3 : FLOAT, Value = 179.1")
    public void gradeC_NOTROUND_3_low(){
        assertEquals(GRADE_C, credit3GradeCalculator.calculateGrade("179.1"));
    }

    @Test
    @DisplayName("GRADE C TEST FOR CREDIT 3 : FLOAT, Value = 179.9")
    public void gradeC_NOTROUND_3_high(){
        assertEquals(GRADE_C, credit3GradeCalculator.calculateGrade("179.9"));
    }

    @Test
    @DisplayName("GRADE F TEST FOR CREDIT 3 : FLOAT, Value = 178.1 ")
    public void gradeF_NOTROUND_3_low(){
        assertEquals(GRADE_F, credit3GradeCalculator.calculateGrade("178.1"));
    }

    @Test
    @DisplayName("GRADE F TEST FOR CREDIT 3 : FLOAT, Value = 178.9 ")
    public void gradeF_NOTROUND_3_high(){
        assertEquals(GRADE_F, credit3GradeCalculator.calculateGrade("178.9"));
    }

    @Test
    @DisplayName("GRADE A TEST FOR CREDIT 4 : FLOAT, Value = 319.1")
    public void gradeA_NOTROUND_4_low(){
        assertEquals(GRADE_A, credit4GradeCalculator.calculateGrade("319.1"));
    }

    @Test
    @DisplayName("GRADE A TEST FOR CREDIT 4 : FLOAT, Value = 319.9")
    public void gradeA_NOTROUND_4_high(){
        assertEquals(GRADE_A, credit4GradeCalculator.calculateGrade("319.9"));
    }

    @Test
    @DisplayName("GRADE B TEST FOR CREDIT 4 : FLOAT, Value = 279.1")
    public void gradeB_NOTROUND_4_low(){
        assertEquals(GRADE_B, credit4GradeCalculator.calculateGrade("279.1"));
    }

    @Test
    @DisplayName("GRADE B TEST FOR CREDIT 4 : FLOAT, Value = 279.9")
    public void gradeB_NOTROUND_4_high(){
        assertEquals(GRADE_B, credit4GradeCalculator.calculateGrade("279.9"));
    }

    @Test
    @DisplayName("GRADE C TEST FOR CREDIT 4 : FLOAT, Value = 239.1 ")
    public void gradeC_NOTROUND_4_low(){
        assertEquals(GRADE_C, credit4GradeCalculator.calculateGrade("239.1"));
    }

    @Test
    @DisplayName("GRADE C TEST FOR CREDIT 4 : FLOAT, Value = 239.9")
    public void gradeC_NOTROUND_4_high(){
        assertEquals(GRADE_C, credit4GradeCalculator.calculateGrade("239.9"));
    }

    @Test
    @DisplayName("GRADE F TEST FOR CREDIT 4 : FLOAT, Value = 238.1 ")
    public void gradeF_NOTROUND_4_low(){
        assertEquals(GRADE_F, credit4GradeCalculator.calculateGrade("238.1"));
    }

    @Test
    @DisplayName("GRADE F TEST FOR CREDIT 4 : FLOAT, Value = 238.9")
    public void gradeF_NOTROUND_4_high(){
        assertEquals(GRADE_F, credit4GradeCalculator.calculateGrade("238.9"));
    }

    @Test
    @DisplayName("NEGATIVE NUMBER TEST FOR CREDIT 3 : BELOW ZERO, Value = -1000")
    public void negative_Grade3_low()
    {
        assertEquals("NEGATIVE NUMBER NOT ALLOWED",credit3GradeCalculator.NEGATIVE_MARKS, credit3GradeCalculator.calculateGrade("-100"));
    }

    @Test
    @DisplayName("NEGATIVE NUMBER TEST FOR CREDIT 3 : BELOW ZERO, Value = -1")
    public void negative_Grade3_high()
    {
        assertEquals("NEGATIVE NUMBER NOT ALLOWED",credit3GradeCalculator.NEGATIVE_MARKS, credit3GradeCalculator.calculateGrade("-1"));
    }

    @Test
    @DisplayName("NEGATIVE NUMBER TEST FOR CREDIT 4 : BELOW ZERO, Value = -1 ")
    public void negative_Grade4_high()
    {
        assertEquals("NEGATIVE NUMBER NOT ALLOWED",credit4GradeCalculator.NEGATIVE_MARKS,credit4GradeCalculator.calculateGrade("-1"));
    }

    @Test
    @DisplayName("NEGATIVE NUMBER TEST FOR CREDIT 4 : BELOW ZERO, Value = -1000 ")
    public void negative_Grade4_low()
    {
        assertEquals("NEGATIVE NUMBER NOT ALLOWED",credit4GradeCalculator.NEGATIVE_MARKS,credit4GradeCalculator.calculateGrade("-1000"));
    }

    @Test
    @DisplayName("UPPER BOUND CROSSING NUMBER TEST FOR CREDIT 3 : ABOVE 400, Value = 401")
    public void upper_Grade3_low()
    {
        assertEquals("ABOVE UPPER BOUND 400 NOT ALLOWED",credit3GradeCalculator.UPPER_MARKS, credit3GradeCalculator.calculateGrade("401"));
    }

    @Test
    @DisplayName("UPPER BOUND CROSSING NUMBER TEST FOR CREDIT 3 : ABOVE 400, Value = 401000")
    public void upper_Grade3_high()
    {
        assertEquals("ABOVE UPPER BOUND 400 NOT ALLOWED",credit3GradeCalculator.UPPER_MARKS, credit3GradeCalculator.calculateGrade("401000"));
    }

    @Test
    @DisplayName("UPPER BOUND CROSSING NUMBER TEST FOR CREDIT 4 : ABOVE 400, Value = 401 ")
    public void upper_Grade4_low()
    {
        assertEquals("ABOVE UPPER BOUND 400 NOT ALLOWED",credit4GradeCalculator.UPPER_MARKS, credit4GradeCalculator.calculateGrade("401"));
    }

    @Test
    @DisplayName("UPPER BOUND CROSSING NUMBER TEST FOR CREDIT 4 : ABOVE 400, Value = 40100 ")
    public void upper_Grade4_high()
    {
        assertEquals("ABOVE UPPER BOUND 400 NOT ALLOWED",credit4GradeCalculator.UPPER_MARKS, credit4GradeCalculator.calculateGrade("40100"));
    }

    @Test
    @DisplayName("NON NUMBER INPUT TEST FOR CREDIT 3 : STRING, Value = NON NUMBER TEST ")
    public void NON_NUMBER_Grade3(){
        assertEquals("NON NUMBER INPUT, ONLY NUMBER FROM 0 TO 400 ALLOWED",credit3GradeCalculator.NON_NUMBER, credit3GradeCalculator.calculateGrade("NON NUMBER TEST"));
    }

    @Test
    @DisplayName("NON NUMBER INPUT TEST FOR CREDIT 4 : STRING, Value = String test")
    public void NON_NUMBER_Grade4(){
        assertEquals("NON NUMBER INPUT, ONLY NUMBER FROM 0 TO 400 ALLOWED",credit4GradeCalculator.NON_NUMBER, credit4GradeCalculator.calculateGrade("String test"));
    }

    @After
    public void TearDown()
    {
       credit3GradeCalculator = null;
       credit4GradeCalculator = null;
    }
}

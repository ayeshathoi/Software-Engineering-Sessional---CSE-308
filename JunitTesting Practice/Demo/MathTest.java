package UnitTesting.Demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class MathTest {

    Math calc;

    @Before
    public void setUp()
    {
        calc = new Math();
    }


    @Test
    public void testAdd()
    {
        //Math calc = new Math();
        assertEquals(12,calc.add(5,6));
        //fail("Not yet implemented");
    }


    @Test
    public void testSub()
    {
        //Math calc = new Math();
        //assertEquals(12,calc.sub(19,7));
        //fail("Not yet implemented");
    }

    @After
    public void TearDown()
    {
        calc = null;
    }

}

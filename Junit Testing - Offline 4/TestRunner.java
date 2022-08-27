package UnitTesting.OfflineUnitTesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {
    public static void main(String[] args)
    {
        String fail = "TESTS FAILED TO MATCH WITH EXPECTED RESULT";
        String passed = "ALL TESTS MATCHED WITH ITS EXPECTED RESULT";
        Result result = JUnitCore.runClasses(GradeTester.class);
        for(Failure failure : result.getFailures())
        {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful() ? passed : fail);
    }
}

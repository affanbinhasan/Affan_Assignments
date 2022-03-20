import java.util.ArrayList;
import java.util.Arrays;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class Junit_LifeCycle {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Junit_LifeCycle.class);
       
        for(Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.println("Result => "+ result.wasSuccessful());
    }
}

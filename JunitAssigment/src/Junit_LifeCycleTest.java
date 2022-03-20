import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Test;

public class Junit_LifeCycleTest {
    static int count = 0;
    @BeforeAll
    public static void setup(){
        System.out.println("Initiating Unit Testing");
    }

    @BeforeEach
    public static void setbefore(){
        System.out.println("Test Case "+ count + " running");
    }

    @Test
    public void testing(){
        String str = new String("string");
        assertEquals("string", str);
    }

    @AfterEach
    public static void setAfter(){
        System.out.println("Test Case "+ count + " Completed");
        count++;
    }

    @AfterAll
    public static void setEnd(){
        System.out.println("Testing Completed");
    }
}

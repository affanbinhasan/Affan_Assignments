import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class MinMaxFinderTest {
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
    @DisplayName("Array can't be NULL")
    public void checkNull(){
        MinMaxFinder arr = new MinMaxFinder(new int[]{56, 34, 7,3, 54, 3, 34, 34, 53});
        assertFalse(arr.getArray() == null);
    }

    @Test
    @DisplayName("Array Size needs to be greater than 1")
    public void checkarraysize(){
        MinMaxFinder arr = new MinMaxFinder(new int[]{56, 34, 7,3, 54, 3, 34, 34, 53});
        assertFalse(arr.getArray().length < 2);
    }

    @Test
    @DisplayName("Resultant array is not correct or wrong order")
    public void checkminmaxmethod(){
        MinMaxFinder test = new MinMaxFinder(new int[]{56, 34, 7,3, 54, 3, 34, 34, 53});
        ArrayList<Integer> arr = test.findminmax();

        assertTrue(arr.get(0)<arr.get(1));
    }

    @Test
    @DisplayName("Resultant Array size should be of size 2")
    public void resArrayLength(){
        MinMaxFinder test = new MinMaxFinder(new int[]{56, 34, 7,3, 54, 3, 34, 34, 53});
        Object arr = test.findminmax_str();

        assertFalse(arr.toString() == null);
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

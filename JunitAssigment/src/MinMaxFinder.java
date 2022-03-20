//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class MinMaxFinder{
    int[] array;

    public MinMaxFinder(int[] array) {
        this.array = array;
    }

    public ArrayList<Integer> findminmax(){
        Arrays.sort(array);
        int a= array[0];
        int b= array[array.length - 1];
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(a);
        res.add(b);
        return res;        

    }

    public Object findminmax_str(){
        Arrays.sort(array);
        int a= array[0];
        int b= array[array.length - 1];
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(a);
        res.add(b);
        return res;        

    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MinMaxFinderTest.class);
       
        for(Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.println("Result => "+ result.wasSuccessful());


    }



    public int[] getArray() {
        return array;
    }
}
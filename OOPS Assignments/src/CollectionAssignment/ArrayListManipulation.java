package CollectionAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListManipulation {
    public static void main(String[] args) {
        System.out.println("Assignment Q3");

        //ArrayList<String> list1 = new ArrayList<String>();
        
        String s = "A quick brown fox jumped over a lazy dog";

        List<String> items = Arrays.asList(s.split(" "));
        //System.out.println(items.toString());

        for (String str : items){
            System.out.print(str+" ");
        }
    }
}

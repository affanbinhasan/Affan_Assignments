package LambdaAssignments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaStringManipulation {
    static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) {
        LambdaStringManipulation.processWords(list);
    }

    public static String processWords(List<String> list) {
        
        Consumer<List<String>> displayFirst = test_list -> {
            
            list.stream().forEach(a -> System.out.print(a.charAt(0) + " "));
            
        };
        
        displayFirst.accept(list);
        //String str ="sdf";
        return null;
    }

}


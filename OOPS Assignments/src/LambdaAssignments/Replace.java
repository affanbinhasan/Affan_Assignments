package LambdaAssignments;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Replace {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        Replace str_list = new Replace();

        str_list.convertToUpperCase(list);
    }

    public List<String> convertToUpperCase(List<String> list) {
        
        for(int i =0 ;i<list.size();i++){
            UnaryOperator<String> to_upper = a -> a.toUpperCase();
            System.out.println(to_upper.apply(list.get(i)));
        }
        

        return null;
    }
}

package LambdaAssignments;

import java.util.ArrayList;

public class RemoveOdds {
    private int name;

    public RemoveOdds(){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Employee Name - "+ name;
    }
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
        return employeeList;
    }
    public static void main(String[] args) {

        ArrayList<String> emp =new ArrayList<String>();

        emp.add("Affan");
        emp.add("Dave");
        emp.add("Stromzy");
        emp.add("Yeezy");
        emp.add("Bach");
        emp.add("Gilbert");
        emp.add("Eminem");
        emp.add("Zach");

        Removal odds = () -> {
            emp.removeIf(ele -> (ele.length() % 2 != 0) );
            System.out.println(emp);
        };

        
        odds.remove();

        
    }
    
}

@FunctionalInterface
interface Removal{
    void remove();
}

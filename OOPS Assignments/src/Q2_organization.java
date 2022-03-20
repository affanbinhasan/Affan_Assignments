//import java.util.*;

//import Employee.Manager;

public class Q2_organization {
    //private static final String Employee = null;
    int salary = 10000;
    public int getSalary(int salary){
        return salary;
    }
    public int total_salary(int[] all_salary){
        int sum = 0;
        for (int i = 0; i<all_salary.length;i++){
            sum += all_salary[i];    
        }
        
        return sum;
    }
    public static class Employee {
        public static class Labour extends Q2_organization{
            @Override
            public int getSalary(int salary){
                int overtime = 500;
                return salary+overtime;
            } 
        }
        public static class Manager extends Q2_organization{
            @Override
            public int getSalary(int salary){
                int incentive = 5000;
                return salary+incentive;
            }
        }
    }
    

    public static void main(String[] args) {
        Employee.Manager me = new Employee.Manager();

        System.out.println(me.getSalary(297385));

        Q2_organization all = new Q2_organization();

        int[] arr = {10835,37895,20480};
        System.out.println(all.total_salary(arr));
    }
    
}


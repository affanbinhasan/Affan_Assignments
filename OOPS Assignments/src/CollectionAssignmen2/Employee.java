package CollectionAssignmen2;
import java.util.*;
public class Employee{
    int id,salary;
    String name,dept;
    public Employee(int id ,String name,String dept,int salary){
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.dept = dept;
    }
    public String toString(){
        return "ID -"+id+" | Name - "+name+ " | Department - "+dept+" | Salary - "+salary;
    }

    public String getName(){
        return name;
    }

    public String getDept(){
        return dept;
    }

    public int getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }

    

    
}
class IdComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return e1.getId()-e2.getId();
    }
}
class NameComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return e1.getName().compareTo(e2.getName());    
    }
}
class DeptComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return e1.getDept().compareTo(e2.getDept());
    }
}
class SalaryComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return e1.getSalary()-e2.getSalary();
    }
}

class Main{
    public static void main(String[] args) {

        System.out.print("Hello There How woukd you like to sort chose from options below: \n");
        System.out.println("A > ID\nB > name\nC > Department\nD > Salary" );

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        if(choice.equals("A")){
            TreeSet<Employee> emp =  new TreeSet<>(new IdComparator());

            emp.add(new Employee(101,"Alex","CSE",10000));
            emp.add(new Employee(102,"Bear","ECE",74602));
            emp.add(new Employee(103,"Saitama","CSE",389749));
            emp.add(new Employee(104,"Hino","AERO",97268));
            emp.add(new Employee(105,"Kaka","SHIP",76325));
            emp.add(new Employee(106,"Zuker","ECE",85233));
            emp.add(new Employee(107,"Ruby","AERO",92764));
            emp.add(new Employee(108,"Dafny","CSE",72486));
            emp.add(new Employee(109,"Zimmer","ECE",86432));
            emp.add(new Employee(110,"Will","SHIP",53272));

            for (Employee srt : emp){
                System.out.println(srt.toString());
            }
        }
        else if(choice.equals("B")){
            TreeSet<Employee> emp =  new TreeSet<>(new NameComparator());

            emp.add(new Employee(101,"Alex","CSE",10000));
            emp.add(new Employee(102,"Bear","ECE",74602));
            emp.add(new Employee(103,"Saitama","CSE",389749));
            emp.add(new Employee(104,"Hino","AERO",97268));
            emp.add(new Employee(105,"Kaka","SHIP",76325));
            emp.add(new Employee(106,"Zuker","ECE",85233));
            emp.add(new Employee(107,"Ruby","AERO",92764));
            emp.add(new Employee(108,"Dafny","CSE",72486));
            emp.add(new Employee(109,"Zimmer","ECE",86432));
            emp.add(new Employee(110,"Will","SHIP",53272));

            for (Employee srt : emp){
                System.out.println(srt.toString());
            }
        }
        else if(choice.equals("C")){
            TreeSet<Employee> emp =  new TreeSet<>(new DeptComparator());

            emp.add(new Employee(101,"Alex","CSE",10000));
            emp.add(new Employee(102,"Bear","ECE",74602));
            emp.add(new Employee(103,"Saitama","CSE",389749));
            emp.add(new Employee(104,"Hino","AERO",97268));
            emp.add(new Employee(105,"Kaka","SHIP",76325));
            emp.add(new Employee(106,"Zuker","ECE",85233));
            emp.add(new Employee(107,"Ruby","AERO",92764));
            emp.add(new Employee(108,"Dafny","CSE",72486));
            emp.add(new Employee(109,"Zimmer","ECE",86432));
            emp.add(new Employee(110,"Will","SHIP",53272));

            for (Employee srt : emp){
                System.out.println(srt.toString());
            }
        }
        else if(choice.equals("D")){
            TreeSet<Employee> emp =  new TreeSet<>(new SalaryComparator());

            emp.add(new Employee(101,"Alex","CSE",10000));
            emp.add(new Employee(102,"Bear","ECE",74602));
            emp.add(new Employee(103,"Saitama","CSE",389749));
            emp.add(new Employee(104,"Hino","AERO",97268));
            emp.add(new Employee(105,"Kaka","SHIP",76325));
            emp.add(new Employee(106,"Zuker","ECE",85233));
            emp.add(new Employee(107,"Ruby","AERO",92764));
            emp.add(new Employee(108,"Dafny","CSE",72486));
            emp.add(new Employee(109,"Zimmer","ECE",86432));
            emp.add(new Employee(110,"Will","SHIP",53272));

            for (Employee srt : emp){
                System.out.println(srt.toString());
            }
        }

        
        
        
    }
}
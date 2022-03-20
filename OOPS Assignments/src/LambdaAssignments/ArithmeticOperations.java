package LambdaAssignments;

public class ArithmeticOperations {
    public static double addition(int num1,int num2)
    {  return num1+num2;   }  

    public static double subtraction(int num1,int num2)
    {   return num1-num2;   }

    public static double multiplication(int num1,int num2)
    {    return num1*num2;   }

    public static double division(int num1,int num2)
    {  return num1/num2;   }
    public static void main(String[] args) {
        int x = 13 , y = 5;

        ArithOps add = () -> {System.out.println(addition(x,y));};
        ArithOps sub = () -> {System.out.println(subtraction(x,y));};
        ArithOps mul = () -> {System.out.println(multiplication(x,y));};
        ArithOps div = () -> {System.out.println(division(x,y));};

        add.calculate();
        sub.calculate();
        mul.calculate();
        div.calculate();
        
    }
    
    
    
}

@FunctionalInterface
interface ArithOps{
    void calculate();
}

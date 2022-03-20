public class Q4 {
    public static void main(String[] args) {
        System.out.println(result(10,10,10));
        System.out.println(result(70,10,10));
        System.out.println(result(10,20,40));
        System.out.println(result(10,30,40));
        
    }
    public static String result(double a,double b,double c){
        double sum1 = a+b;
        double sum2 = b+c;
        double sum3 = a+c;
        if (a>60 & b>60 & c>60){    
            return "promoted";
        }
        else if (sum1>60 || sum2>60 || sum3>60){
            return "promoted";
        }
        else{return "failed";}
    }

}

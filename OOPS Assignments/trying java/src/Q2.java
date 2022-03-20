public class Q2 {
    public static void main(String[] args) {
        double prin = 2;
        int time = 1;
        double rate =1;
        double a = si(prin,time,rate);
        System.out.println(a);
        double b = ci(prin,time,rate);
        System.out.println(b);
    }
    public static double si(double p,int n,double r){
        double res = (p*r*n)/100;
        return res;
    }
    public static double ci(double p,int t,double r){
        double res = p*(Math.pow((1+r/100), t));
        return res;
    }
    
}

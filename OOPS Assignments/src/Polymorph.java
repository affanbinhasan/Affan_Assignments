public class Polymorph {
    //METHOD OVERLOADING
    public int multiply(int a , int b){
        return a*b;
    }

    public double multiply(double a, int b){
        return a*b;
    }

    public double multiply(double a,double b){
        return a*b;
    }

    //METHOD OVERRIDING
    public static class Override extends Polymorph{

        public int multiply(int a,int b,int c){
            return a*b*c;
        }

    }
    public static void main(String[] args) {
        Polymorph me = new Polymorph();

        Polymorph.Override you = new Polymorph.Override();

        System.out.println(me.multiply(1,2));
        System.out.println(you.multiply(1,2,3));
    }

}


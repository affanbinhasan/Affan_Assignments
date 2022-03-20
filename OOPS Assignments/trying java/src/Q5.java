public class Q5 {
    public static void main(String[] args) {
        System.out.println(tax(193456));
        System.out.println(tax(320000));
        System.out.println(tax(250653));
        System.out.println(tax(720000));
    }
    public static double tax(int a){
        double totaltax = 0;
        if (a>0 & a<180000){totaltax += 0;System.out.println("Slab A");}
        else if(a>181000 & a< 300000){totaltax += a*1/10;System.out.println("Slab B");}
        else if(a>300000 & a<500000){totaltax += a*2/10;System.out.println("Slab C");}
        else if(a>500000 & a<1000000){totaltax += a*3/10;System.out.println("Slab D");}

        return totaltax;
    }
}

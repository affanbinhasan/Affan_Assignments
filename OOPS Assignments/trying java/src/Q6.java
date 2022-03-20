import java.util.*;

public class Q6 {
    static String Username = "Ajay";
    static String password = "password";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Username");
        String str1 = sc.nextLine();
        System.out.println("Please Enter your Password");
        String str2 = sc.nextLine();
        System.out.println(validate(str1, str2));
    }
    public static String validate(String a,String b){
        //String Username = "Ajay";
        //String password = "password";
        
        //Q6 obj = new Q6();
        System.out.println(a+" "+b);
        if (a.equals(Username) & b.equals(password)){return "Welcome " + Username;}
        else{return "You have entered wrong credentials ,please enter the right credentials.";}
    }
}

import java.util.Scanner;

public class Q7_wInterface {
    int item_count = 0;
    int total_cost = 0;
    
    int ice_count = 0;
    int ice_cost = 0;

    int candy_count = 0;
    int candy_cost = 0;
    
    int cookie_count = 0;
    int cookie_cost = 0;
    static boolean admin = false;
    static boolean customer = false;
    //abstract public int getcost();

    public void addItem(){
        if (admin == true){
        item_count++;}
        else {
            System.out.println("sorry you are not authorized for this operation");
        }
    };

    public void selectroles(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.equals("owner")){
            admin = true;
        }else {customer =true;}
    }
    public void roles(String state){
    }
    public void rolesOperation(){}
    public void PlaceOrder(){
        System.out.println("Your order is successfully placed");
        System.out.println("Your order amount is : "+ total_cost);
    }

    public int Add_candy(int n){
        candy_count+=n;
        item_count += candy_count;
        candy_cost += n*60;
        total_cost += candy_cost;
        return n;
    }
    public int Add_icecream(int n){
        ice_count+=n;
        item_count += ice_count;
        ice_cost += n*1;
        total_cost+=ice_cost;
        return n;
    }
    public int Add_cookie(int n){
        cookie_count+=n;
        item_count += cookie_count;
        cookie_cost += n*70;
        total_cost += cookie_cost;
        return n;
    }

    
    public interface Candy{
        public int Add_candy();
    }
}

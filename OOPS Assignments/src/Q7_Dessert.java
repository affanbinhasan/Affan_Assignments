import java.util.Scanner;

public class Q7_Dessert {
    int item_count = 0;
    int total_cost = 0;
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
    

    public static class Candy extends Q7_Dessert{
        int candy_count = 0;
        int candy_cost = 0;
        
        public int getcost(){
            return 60;
        }

        public int Add_candy(int n){
            candy_count+=n;
            item_count += candy_count;
            candy_cost += n*60;
            total_cost += candy_cost;
            return n;
    
        }

    }
    public static class Icecream extends Q7_Dessert{
        int ice_count = 0;
        int Ice_cost = 0;
        public int getcost(){
            return 1;
        }
        public int Add_icecream(int n){
            ice_count+=n;
            item_count += ice_count;
            Ice_cost += n*1;
            total_cost+=Ice_cost;
            return n;
        }
    }
    public static class Cookie extends Q7_Dessert{
        int cookie_count = 0;
        int cookie_cost = 0;
        public int getcost(){
            return 70;
        }
        public int Add_cookie(int n){
            cookie_count+=n;
            item_count += cookie_count;
            cookie_cost += n*70;
            total_cost += cookie_cost;
            return n;
        }
    }

    public static void main(String[] args) {
        Q7_Dessert.Candy candy = new Q7_Dessert.Candy();
        Q7_Dessert.Icecream icecream = new Q7_Dessert.Icecream();
        Q7_Dessert.Cookie cookie = new Q7_Dessert.Cookie();

        

        candy.Add_candy(3);
        icecream.Add_icecream(3);
        cookie.Add_cookie(3);

        Q7_Dessert custom = new Q7_Dessert();
        
        System.out.println(custom.total_cost);
        
    }
}

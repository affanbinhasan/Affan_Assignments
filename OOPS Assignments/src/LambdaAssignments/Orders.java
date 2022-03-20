package LambdaAssignments;

import java.util.ArrayList;

public class Orders {
    private int total_price;
    private String status;

    public Orders(int total_price,String status){
        this.total_price =total_price;
        this.status=status;
    }

    @Override
    public String toString(){
        return "Order value = "+total_price+"\nOrder Status = "+status+"\n";
    }

    public int getTotal_price()
    {    return total_price;    }

    public String getStatus()
    {  return status;   }

    public static ArrayList<Orders> listOfOrders(ArrayList<Orders> orders) 
    {   return orders;  }

    public static void main(String[] args) {

        ArrayList<Orders> o = new ArrayList<Orders>();

        o.add(new Orders(578937,"ACCEPTED"));
        o.add(new Orders(9348, "COMPLETED"));
        o.add(new Orders(674,"COMPLETED"));
        o.add(new Orders(87246,"ACCEPTED"));
        o.add(new Orders(345,"COMPLETED"));
        o.add(new Orders(8462,"ACCEPTED"));
        o.add(new Orders(87243,"COMPLETED"));
        
        Differentiate diff = () -> {for (int i = 0;i<o.size();i++){
            int price = o.get(i).getTotal_price();
            String status = o.get(i).getStatus();

            if (price > 10000){System.out.println(o.get(i).toString());}
            else if(status.equals("COMPLETED")){System.out.println(o.get(i).toString());}

            
            
        }

        
    };

    diff.differ();


    }
}

@FunctionalInterface
interface Differentiate{
    void differ();
};

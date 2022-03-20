package CollectionAssignmen2;

//import java.util.Map;
import java.util.TreeMap;

public class Contacts {
    public static void main(String[] args) {
        TreeMap<Long,String> contact = new TreeMap<>();
 
        contact.put((long) 766770752,"Affan");
        contact.put((long) 975923926,"Zikr");
        contact.put((long) 973626743,"Dawood");
        contact.put((long) 983759727,"Zuman");
        contact.put((long) 762359693,"Fikr");


        //fetching all the keys
        System.out.println(contact.keySet());

        //fetching all the values
        System.out.println(contact.values());

        //printing all key value pairs
        System.out.println(contact);
    } 
}

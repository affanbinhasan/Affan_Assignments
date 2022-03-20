package StreamsAssignments;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
    
}

public class TraderStream {
    public static List<String> printUniqueCities (List <Trader> traders) { 
        traders.stream().distinct().forEach(System.out::println);
        return null; }

    public static List<String> tradersFromPuneSortByName(List<Trader> traders) {
        traders.stream().filter(item -> item.getCity().equals("Pune")).sorted((a,b) -> a.getName().compareTo(b.getName())).forEach(System.out::println);;
        return null;
    }

    public static String allTraderNames(List<Trader> traders) {
        List<Trader> list = traders.stream().sorted((a,b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());
        
        Consumer<List<Trader>> display = test_list -> {
            for (int i = 0; i<test_list.size();i++){
                System.out.println(test_list.get(i).getName());
            }
        };
        display.accept(list);
        return null;}

    public static ArrayList<Trader> areAnyTradersFromIndore(ArrayList<Trader> traders) {
        traders.stream().anyMatch(item -> item.getCity().equals("Indore"));
        return null;}
    public static void main(String[] args) {}
}

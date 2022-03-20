package StreamsAssignments;
import java.util.*;

class Fruit {
    private String name;
    private int calories;
    private int price;
    private String color;

    public String getColor() {
        return color;
    }

    public int getCalories(){
        return calories;
    }

    public String getName(){
        return name;
    }

    public Fruit(String name,int calories,int price,String color){
        this.name = name;
        this.calories = calories;
        this.price= price;
        this.color = color;
    }
}

public class FruitStream {
    ArrayList<Fruit> Fruit = new ArrayList<>();
    public static List<String> calreverseSort(ArrayList<Fruit> Fruit) {
        Fruit.stream().filter(f -> f.getCalories()>100).sorted((a,b) -> a.getCalories()-b.getCalories()).forEach(f -> System.out.println(f.getName()+" "+f.getCalories()));
        return null;
    }

    public static ArrayList<Fruit> colorsort(ArrayList<Fruit> Fruit) {
        Fruit.stream().sorted((a,b) -> a.getColor().compareTo(b.getColor())).forEach(f -> System.out.println(f.getName()+" "+f.getColor()));
        return null;
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> Fruit ){
        Fruit.stream().filter(item -> item.getColor().equals("red")).forEach(f -> System.out.println(f.getName()));
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit("apple", 4563, 10, "red"));
        fruits.add(new Fruit("orange", 2764, 20, "orange"));
        fruits.add(new Fruit("grape", 2864, 30, "purple"));
        fruits.add(new Fruit("cherry", 67, 10, "red"));
        fruits.add(new Fruit("pomegranate", 99, 10, "red"));

        FruitStream.filterRedSortPrice(fruits);
        System.out.println();
        FruitStream.colorsort(fruits);
        System.out.println();
        FruitStream.calreverseSort(fruits);
        
    }
}

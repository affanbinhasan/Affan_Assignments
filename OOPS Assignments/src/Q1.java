class Q1_Singleton{
    private static Q1_Singleton one_instance = null;
    public String s;
    public int count = 0;

    private Q1_Singleton(){
        s = "Only one instance at a time";
    }
    public static Q1_Singleton getInstance(){
        if (one_instance == null){
            one_instance = new Q1_Singleton();
            
        }
        return one_instance;
    }

    public void Up(){
        count++;
    }
}

class Main{
    public static void main(String[] args) {
        Q1_Singleton a = Q1_Singleton.getInstance();
        Q1_Singleton b = Q1_Singleton.getInstance();
        Q1_Singleton c = Q1_Singleton.getInstance();
        
        if (a == b && b == c){
            System.out.println("all objects belongs to the same instance");
        }
        else{System.out.println("Not Singleton");}

        a.Up();
        b.Up();
        c.Up();

        System.out.println(a.count);

    }
}
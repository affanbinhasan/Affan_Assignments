package StringAssignments;

public class Strings_Assignment {
    public static void main(String[] args) {
        //Pen p = new Pen();
        //System.out.println(p.color);
        //System.out.println(p.point);
        //System.out.println(p.type);
        
        //System.out.println(p.clicked);
        //Headphones h = new Headphones();
        //h.owner();
        //h.authority();

        //Assignment on String

        //Q1

        String str = "Hello World";

        System.out.println(str.length());

        //Q2
        String one = "Hello,";
        String two = "How are you?";

        System.out.println(one.concat(two));

        //Q3
        String pool = "Java String pool refers to collection of Strings which are stored in heap memory";

        System.out.println(pool.toLowerCase());
        System.out.println(pool.toUpperCase());
        System.out.println(pool.replace("a", "$"));
        System.out.println(pool.contains("collection"));
        System.out.println(pool.equals("java string pool refers to collection of strings which are stored in heap memory"));
        System.out.println(pool.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));
        
        //String Buffer

        
        StringBuffer strbuff = new StringBuffer();
        
        strbuff.append("StringBuffer ");
        strbuff.append("is a peer class of String ");
        strbuff.append("that provides much of");
        strbuff.append("the functionality of strings");

        //Q1
        System.out.println(strbuff);

        //Q2

        StringBuffer strbuff2 = new StringBuffer("It is used to _ at the specified index position");

        //strbuff2.insert(13, " insert text");
        strbuff2.replace(14, 15, "insert text");

        System.out.println(strbuff2);

        //Q3
        StringBuffer strbuff3 = new StringBuffer("This method returns the reversed object on which it was called");

        //strbuff3.reverse();
        System.out.println(strbuff3.reverse());

        //StringBuilder

        //Q1
        StringBuilder strbld = new StringBuilder();
        strbld.append("String Builder ");
        strbld.append("is a peer class of String ");
        strbld.append("that provides much of");
        strbld.append("the functionality of strings");
        
        System.out.println(strbld);
        //Q2
        StringBuilder strbld2 = new StringBuilder("It is used to _ at the specified index position");
        strbld2.insert(14,"insert text");
        System.out.println(strbld2);

        //Q3
        StringBuilder strbld3 = new StringBuilder("This method returns the reversed object on which it was called");

        System.out.println(strbld3.reverse());
    }
}

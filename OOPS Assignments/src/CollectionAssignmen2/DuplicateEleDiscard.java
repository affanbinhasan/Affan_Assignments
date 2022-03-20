package CollectionAssignmen2;

import java.util.HashSet;

public class DuplicateEleDiscard {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<String>();

        hash.add("First");
        hash.add("Second");
        hash.add("Third");
        hash.add("Fourth");
        hash.add("Fifth");
        hash.add("sixth");
        hash.add("seventh");
        hash.add("eighth");
        hash.add("nineth");
        hash.add("tenth");
        
        //printing hashset and its length
        System.out.println(hash);
        System.out.println(hash.size());

        //trying to add duplicate elements
        hash.add("Fourth");
        hash.add("eighth");

        //printing hashset to check for changes
        System.out.println(hash);

        

        //checking for duplicate elements rejection silently
        System.out.println(hash.size());


    }
}

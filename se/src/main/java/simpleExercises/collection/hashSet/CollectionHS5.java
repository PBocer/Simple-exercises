package simpleExercises.collection.hashSet;


import java.util.HashSet;

/*
Write a Java program to test a hash set is empty or not.
 */
public class CollectionHS5 {
    public static void main(String[] args) {
        HashSet<String>hset= new HashSet<>();
        hset.add("Green");
        hset.add("Black");
        hset.add("Blue");
        hset.add("Pink");
        hset.add("Purple");

        System.out.println("Original Hash Set: "+ hset);
        System.out.println("Checking the above array list is empty or not!"+ hset.isEmpty());
        hset.removeAll(hset);
        System.out.println("Hash Set after removing all the elements " + hset);

    }
}

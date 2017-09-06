package simpleExercises.collection.hashSet;

import java.util.HashSet;

/*
Write a Java program to empty an hash set.
 */
public class CollectionHS4 {
    public static void main(String[] args) {

        HashSet<String>hset= new HashSet<>();
        hset.add("Red");
        hset.add("Pink");
        hset.add("Green");
        hset.add("Black");

        System.out.println("Hash : "+ hset );

        hset.removeAll(hset);
        System.out.println("New hash : " + hset);
    }
}

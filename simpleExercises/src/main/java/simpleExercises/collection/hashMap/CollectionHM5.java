package simpleExercises.collection.hashMap;

import java.util.HashMap;

/*
Write a Java program to check whether a map contains key-value mappings (empty) or not.
 */
public class CollectionHM5 {
    public static void main(String[] args) {
        HashMap<Integer, String>hashmap= new HashMap<Integer, String>();
        hashmap.put(1, "Red");
        hashmap.put(1, "Blue");
        hashmap.put(1, "Orange");
        boolean results= hashmap.isEmpty();

        System.out.println("Is hash map empty: "+ results);

        hashmap.clear();

        results=hashmap.isEmpty();

        System.out.println("Is hash map empty: "+ results);
    }
}

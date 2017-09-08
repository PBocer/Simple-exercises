package simpleExercises.collection.hashMap;

import java.util.HashMap;

/*
Write a Java program to remove all the mappings from a map.
 */
public class CollectionHM4 {
    public static void main(String[] args) {

        HashMap<Integer, String>hashmap= new HashMap<>();
        hashmap.put(1, "Red");
        hashmap.put(2, "Blue");
        hashmap.put(3, "White");
        hashmap.put(4, "Orange");
        System.out.println("Orginal linked map "+hashmap);

        hashmap.clear();
        System.out.println("New linked map "+hashmap);

    }
}

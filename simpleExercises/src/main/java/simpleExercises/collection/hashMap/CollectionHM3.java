package simpleExercises.collection.hashMap;

import java.util.HashMap;

/*
Write a Java program to copy all of the mappings from the specified map to another map.
 */
public class CollectionHM3 {
    public static void main(String[] args) {
        HashMap<Integer, String>hashmap1= new HashMap<Integer, String>();
        HashMap<Integer, String>hashmap2= new HashMap<Integer, String>();
        hashmap1.put(1,"Red");
        hashmap1.put(2,"Green");
        hashmap1.put(3,"White");
        System.out.println("\\nValues in first map: "+hashmap1);

        hashmap2.put(4, "Pink");
        hashmap2.put(5, "Black");
        hashmap2.put(6, "Orange");
        System.out.println("\\nValues in second map: "+ hashmap2);

        hashmap2.putAll(hashmap1);
        System.out.println("\\nNow values in second map: " + hashmap2);


    }
}

package simpleExercises.collection.hashMap;


import java.util.HashMap;

/*
Write a Java program to get a shallow copy of a HashMap instance.
Napisz program w języku Java, aby uzyskać płytką kopię instancji HashMap.
 */
public class CollectionHM6 {

    public static void main(String[] args) {

        HashMap<Integer,String>hashMap= new HashMap<Integer, String>();
        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Black");
        hashMap.put(4, "White");
        hashMap.put(5, "Blue");
        System.out.println("The Original map: " + hashMap);

        HashMap<Integer,String>newHashMap= new HashMap<Integer, String>();
        newHashMap=(HashMap)hashMap.clone();
        System.out.println("Cloned map: " + newHashMap);
    }
}

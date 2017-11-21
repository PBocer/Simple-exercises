package simpleExercises.collection.hashMap;

import java.util.HashMap;

/*
Write a Java program to test if a map contains a mapping for the specified value.
Napisz program Java, aby sprawdzić, czy mapa zawiera mapowanie dla określonej wartości.
 */
public class CollectionHM8 {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Green");
        hashMap.put(2, "Red");
        hashMap.put(3, "Yellow");
        hashMap.put(4, "Pink");
        hashMap.put(5, "Orange");
        System.out.println("HashMap " + hashMap);

        if (hashMap.containsValue("Green")) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


    }
}

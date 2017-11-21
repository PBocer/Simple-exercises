package simpleExercises.collection.hashMap;


import java.util.HashMap;

/*
Write a Java program to test if a map contains a mapping for the specified key.
Napisz program Java, aby sprawdzić, czy mapa zawiera mapowanie dla określonego klucza.
 */
public class CollectionHM7 {
    public static void main(String[] args) {

        HashMap<String,Integer>hashMap= new HashMap<String, Integer>();
        hashMap.put("Green",1);
        hashMap.put("Red",2);
        hashMap.put("Yellow",3);
        hashMap.put("Pink",4);
        hashMap.put("Orange",5);

        System.out.println("The Original map: "+ hashMap);

        if (hashMap.containsKey("Green")) {
            System.out.println("Yes, hash map contain Green");
        }else{
            System.out.println("No");
            }

        }

    }

package simpleExercises.collection.arrayList;

import java.util.ArrayList;
import java.util.List;
/*
Write a Java program to retrieve an element (at a specified index) from a given array list.
 */
public class CollectionAL4 {
    public static void main(String[] args) {

        List<String> stringList= new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("Orange");
        stringList.add("Pink");
        System.out.println(stringList);

        String element= stringList.get(0);
        String element2= stringList.get(3);

        System.out.println(element);
        System.out.println(element2);


    }
}

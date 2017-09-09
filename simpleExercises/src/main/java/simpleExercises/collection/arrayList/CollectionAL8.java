package simpleExercises.collection.arrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Write a Java program to sort a given array list.
 */
public class CollectionAL8 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("Orange");
        stringList.add("Pink");
        System.out.println(stringList);

        Collections.sort(stringList);
        System.out.println(stringList);

    }
}

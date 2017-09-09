package simpleExercises.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to remove the third element from a array list.
 */
public class CollectionAL6 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("Orange");
        stringList.add("Pink");
        System.out.println(stringList);

        stringList.remove(2);
        System.out.println(stringList);
    }
}

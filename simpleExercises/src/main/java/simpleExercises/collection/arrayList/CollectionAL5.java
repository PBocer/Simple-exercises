package simpleExercises.collection.arrayList;

import java.util.ArrayList;
import java.util.List;
/*
Write a Java program to update specific array element by given element.
 */
public class CollectionAL5 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("Orange");
        stringList.add("Pink");
        System.out.println(stringList);

        stringList.set(2,"Green");
        System.out.println(stringList);

    }
}
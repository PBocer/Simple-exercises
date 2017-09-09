package simpleExercises.collection.arrayList;

/*
Write a Java program to reverse elements in a array list.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionAL11 {
    public static void main(String[] args) {

        List<String>stringList= new ArrayList<String>();
        stringList.add("Blue");
        stringList.add("Red");
        stringList.add("White");
        stringList.add("Black");
        System.out.println(" List before reverse\n "+stringList );

        Collections.reverse(stringList);
        System.out.println("List after reverse\n "+ stringList);
    }
}

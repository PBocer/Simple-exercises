package simpleExercises.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to extract a portion of a array list.
 */
public class CollectionAL12 {
    public static void main(String[] args) {

        List<String>stringList= new ArrayList<String>();
        stringList.add("Red");
        stringList.add("White");
        stringList.add("Green");
        stringList.add("Pink");
        System.out.println("Original list "+ stringList);

        List<String>subList= stringList.subList(0,3);

        System.out.println("New list :"+subList);

    }
}

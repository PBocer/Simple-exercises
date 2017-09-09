package simpleExercises.collection.arrayList;


import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to insert an element into the array list at the first position.
 */
public class CollectionAL3 {
    public static void main(String[] args) {

        List<String>stringList= new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("Orange");
        stringList.add("Pink");
        System.out.println(stringList);


        stringList.add(0,"Black");
        stringList.add(4,"Green");

        System.out.println("New list"+ stringList);


    }
}

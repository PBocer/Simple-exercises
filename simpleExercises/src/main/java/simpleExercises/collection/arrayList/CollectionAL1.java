package simpleExercises.collection.arrayList;


import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to create a new array list, add some colors (string) and print out the collection.
 */
public class CollectionAL1 {
    public static void main(String[] args) {


        List<String>stringList= new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("White");
        stringList.add("Orange");
        System.out.println(stringList);
    }
}

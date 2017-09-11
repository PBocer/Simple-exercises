package simpleExercises.collection.arrayList;


import java.util.ArrayList;

/*
Write a Java program to trim the capacity of an array list the current list size.
 */
public class CollectionAL19 {
    public static void main(String[] args) {
        ArrayList<String>stringList= new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("Orange");
        stringList.add("Black");
        System.out.println("Original array list: "+ stringList);
        System.out.println("Let trim to size the above array:");
        stringList.trimToSize();
        System.out.println(stringList);
    }
}

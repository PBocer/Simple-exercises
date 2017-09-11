package simpleExercises.collection.arrayList;


import java.util.ArrayList;

/*
Write a Java program to increase the size of an array list.
 */
public class CollectionAL20 {
    public static void main(String[] args) {

        ArrayList<String>stringList= new ArrayList<String>(3);
        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("Green");
        System.out.println("Original array list: " + stringList);

        stringList.ensureCapacity(6);
        stringList.add("Orange");
        stringList.add("Black");
        stringList.add("Pink");
        System.out.println("New array list: "+ stringList);

    }
}

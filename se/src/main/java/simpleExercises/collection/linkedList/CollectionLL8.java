package simpleExercises.collection.linkedList;

import java.util.LinkedList;

/*
Write a Java program to insert the specified element at the end of a linked list.
 */
public class CollectionLL8 {
    public static void main(String[] args) {

        LinkedList<String> stringList= new LinkedList<>();
        stringList.add("Red");
        stringList.add("White");
        stringList.add("Black");
        System.out.println("Original linked list: " + stringList);

        stringList.offerLast("Pink");
        System.out.println("Final linked list: "+ stringList);

    }
}

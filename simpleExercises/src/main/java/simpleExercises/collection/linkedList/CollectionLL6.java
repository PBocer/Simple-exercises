package simpleExercises.collection.linkedList;

import java.util.LinkedList;

/*
Write a Java program to insert elements into the linked list at the first and last position.
 */
public class CollectionLL6 {
    public static void main(String[] args) {

        LinkedList<String>stringList= new LinkedList<String>();
        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("Pink");
        System.out.println("Original linked list: "+ stringList);

        stringList.addFirst("Orange");
        stringList.addLast("Green");
        System.out.println("Final linked list: "+ stringList);



    }
}

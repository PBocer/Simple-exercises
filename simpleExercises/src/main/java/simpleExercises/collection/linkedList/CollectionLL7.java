package simpleExercises.collection.linkedList;

import java.util.LinkedList;

/*
Write a Java program to insert the specified element at the front of a linked list.
 */
public class CollectionLL7 {
    public static void main(String[] args) {
        LinkedList<String> stringList= new LinkedList<String>();
        stringList.add("Red");
        stringList.add("Green");
        stringList.add("Black");
        System.out.println("Original linked list: "+ stringList);

        stringList.offerFirst("Pink");
        System.out.println("Final linked list: "+ stringList);


    }
}

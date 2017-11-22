package simpleExercises.collection.linkedList;

import java.util.LinkedList;

/*
Write a Java program to get the first and last occurrence of the specified elements in a linked list.
Napisz program Java, aby uzyskać pierwsze i ostatnie wystąpienie określonych elementów na liście połączonej.
 */
public class CollectionLL10 {
    public static void main(String[] args) {

        LinkedList<String>linkedList= new LinkedList<String>();
        linkedList.add("Red");
        linkedList.add("Pink");
        linkedList.add("Orange");
        linkedList.add("Black");

        System.out.println("First list: "+linkedList);

        Object firstElement= linkedList.getFirst();
        Object lastElement= linkedList.getLast();

        System.out.println("First element "+ firstElement);
        System.out.println("Last element "+ lastElement);


    }
}

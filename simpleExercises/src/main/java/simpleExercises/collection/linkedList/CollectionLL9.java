package simpleExercises.collection.linkedList;

/*
Write a Java program to insert some elements at the specified position into a linked list.
Napisz program w języku Java, aby wstawić niektóre elementy w określonej pozycji do listy połączonej.
 */

import java.util.LinkedList;

public class CollectionLL9 {
    public static void main(String[] args) {

        LinkedList<String>linkedList= new LinkedList<String>();
        linkedList.add("Red");
        linkedList.add("Pink");
        linkedList.add("Orange");

        System.out.println("FIrst linked list "+linkedList);

        LinkedList<String>newLinkedList= new LinkedList<String>();
        newLinkedList.add("Blue");
        newLinkedList.add("Green");

        System.out.println("New linked list "+newLinkedList);

        linkedList.addAll(1,newLinkedList);

        System.out.println("Final list " +linkedList);
    }
}

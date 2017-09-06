package simpleExercises.collection.linkedList;

import java.util.LinkedList;

/*
Write a Java program to insert the specified element at the specified position in the linked list.
 */
public class CollectionLL5 {
    public static void main(String[] args) {

        LinkedList<String> stringList= new LinkedList<String>();
        stringList.add("Red");
        stringList.add("Black");
        stringList.add("White");
        stringList.add("Orange");
        stringList.add("Pink");
        System.out.println("Normal list: "+ stringList);

        stringList.add(1, "Purple");
        System.out.println("New List: "+ stringList);


    }
}

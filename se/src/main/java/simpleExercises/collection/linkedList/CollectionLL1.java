package simpleExercises.collection.linkedList;

import java.util.LinkedList;

/*
Write a Java program to append the specified element to the end of a linked list.
 */
public class CollectionLL1 {
    public static void main(String[] args) {

        LinkedList<String>stringList= new LinkedList<String>();
        stringList.add("Red");
        stringList.add("Green");
        stringList.add("Orange");
        stringList.add("White");
        stringList.add("Black");
        System.out.println("LInked list : "+ stringList);


    }
}

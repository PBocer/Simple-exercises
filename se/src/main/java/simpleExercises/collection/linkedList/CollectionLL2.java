package simpleExercises.collection.linkedList;


import java.util.LinkedList;

/*
Write a Java program to iterate through all elements in a linked list.


 */
public class CollectionLL2 {
    public static void main(String[] args) {

        LinkedList<String> stringList = new LinkedList<String>();
        stringList.add("Red");
        stringList.add("White");
        stringList.add("Black");
        stringList.add("Blue");
        stringList.add("Orange");

        for (String element : stringList) {
            System.out.println(element);
        }
    }
}

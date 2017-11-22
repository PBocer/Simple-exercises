package simpleExercises.collection.linkedList;

import java.util.LinkedList;

/*
Write a Java program to display the elements and their positions in a linked list.
Napisz program w języku Java, aby wyświetlić elementy i ich pozycje na liście połączonej.
 */
public class CollectionLL11 {
    public static void main(String[] args) {

        LinkedList<String> lindekList = new LinkedList<String>();

        lindekList.add("Red");
        lindekList.add("Green");
        lindekList.add("Black");
        lindekList.add("Pink");
        lindekList.add("orange");

        System.out.println("First List " + lindekList);

        for (int i = 0; i < lindekList.size(); i++) {
            System.out.println("Element at index"+i+" : "+lindekList.get(i));
        }
    }
}
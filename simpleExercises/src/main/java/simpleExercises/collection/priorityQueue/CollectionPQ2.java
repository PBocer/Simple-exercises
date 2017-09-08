package simpleExercises.collection.priorityQueue;


import java.util.PriorityQueue;

/*
Write a Java program to iterate through all elements in priority queue.
 */
public class CollectionPQ2 {
    public static void main(String[] args) {

        PriorityQueue<String>strinlist= new PriorityQueue<>();
        strinlist.add("Black");
        strinlist.add("Red");
        strinlist.add("Green");
        strinlist.add("White");

        for (String element: strinlist){
            System.out.println(element);
        }

    }
}

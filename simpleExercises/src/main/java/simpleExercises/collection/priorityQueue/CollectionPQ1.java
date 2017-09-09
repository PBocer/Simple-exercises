package simpleExercises.collection.priorityQueue;


/*
Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.
 */

import java.util.PriorityQueue;

public class CollectionPQ1 {
    public static void main(String[] args) {
        PriorityQueue<String>stronglist= new PriorityQueue<String>();
        stronglist.add("Red");
        stronglist.add("Black");
        stronglist.add("White");
        stronglist.add("Green");
        System.out.println(stronglist);
    }
}

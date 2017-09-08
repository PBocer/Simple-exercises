package simpleExercises.collection.priorityQueue;


import java.util.PriorityQueue;

/*
Write a Java program to insert a given element into a priority queue.
 */
public class CollectionPQ4 {
    public static void main(String[] args) {

        PriorityQueue<String>stringlist= new PriorityQueue<>();
        stringlist.add("Green");
        stringlist.add("Red");
        stringlist.add("Blue");
        stringlist.add("Black");
        System.out.println(stringlist);

        stringlist.offer("Pink");
        System.out.println(stringlist);
    }
}

package simpleExercises.collection.treeSet;


import java.util.TreeSet;

/*
Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
 */
public class CollectionTS1 {
    public static void main(String[] args) {
        TreeSet<String>tset= new TreeSet<String>();
        tset.add("Red");
        tset.add("Blue");
        tset.add("Pink");
        tset.add("Black");
        System.out.println("Tree set: \n"+ tset);
    }
}

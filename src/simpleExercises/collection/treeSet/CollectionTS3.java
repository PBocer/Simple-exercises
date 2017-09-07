package simpleExercises.collection.treeSet;

import java.util.TreeSet;

/*
Write a Java program to add all the elements of a specified tree set to another tree set.
 */
public class CollectionTS3 {
    public static void main(String[] args) {
        TreeSet<String>tset= new TreeSet<>();
        tset.add("Red");
        tset.add("Pink");
        tset.add("Orange");
        System.out.println("First list: "+tset);

        TreeSet<String>tset2= new TreeSet<>();
        tset2.add("Blue");
        tset2.add("Green");
        tset2.add("Black");
        System.out.println("Second List" + tset2);

        tset.addAll(tset2);
        System.out.println("Last list" + tset);


    }
}

package simpleExercises.collection.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

/*
Write a Java program to create a reverse order view of the elements contained in a given tree set.
 */
public class CollectionTS4 {
    public static void main(String[] args) {
        TreeSet<String> t_set = new TreeSet<String>();
        // use add() method to add values in the tree set
        t_set.add("Red");
        t_set.add("Green");
        t_set.add("Black");
        t_set.add("Pink");
        t_set.add("orange");
        System.out.println("Original tree set:" + t_set);

        Iterator it= t_set.descendingIterator();
        System.out.println(t_set);

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

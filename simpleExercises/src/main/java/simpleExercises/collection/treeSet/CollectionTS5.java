package simpleExercises.collection.treeSet;

import java.util.TreeSet;

/*
Write a Java program to get the first and last elements in a tree set.
 */
public class CollectionTS5 {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");
        System.out.println("Tree set: ");
        System.out.println(tree_set);

        String firstelement= tree_set.first();
        System.out.println("First element: "+ firstelement);

        String lastelement = tree_set.last();
        System.out.println("Last element : "+ lastelement);

    }
}

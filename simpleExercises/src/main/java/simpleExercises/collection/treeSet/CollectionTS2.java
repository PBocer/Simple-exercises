package simpleExercises.collection.treeSet;


import java.util.TreeSet;

/*
Write a Java program to iterate through all elements in a tree set.
 */
public class CollectionTS2 {
    public static void main(String[] args) {

        TreeSet<String> tset= new TreeSet<String>();
        tset.add("Red");
        tset.add("Black");
        tset.add("White");
        tset.add("Green");
        System.out.println(tset);

        for (String element: tset){
            System.out.println(element);
        }

    }
}

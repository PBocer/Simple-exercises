package simpleExercises.collection.hashSet;

import java.util.HashSet;
import java.util.Iterator;

/*
Write a Java program to iterate through all elements in a hash list.
 */
public class CollectionHS2 {
    public static void main(String[] args) {

        HashSet<String>hset= new HashSet<String>();
        hset.add("Black");
        hset.add("Red");
        hset.add("Pink");

        Iterator p= hset.iterator();

        while (p.hasNext()){
            System.out.println(p.next());
        }

    }
}

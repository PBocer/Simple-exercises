package simpleExercises.collection.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

/*
Write a Java program to iterate a linked list in reverse order.
 */
public class CollectionLL4 {
    public static void main(String[] args) {

        LinkedList<String>stringList= new LinkedList<String>();
        stringList.add("Red");
        stringList.add("Pink");
        stringList.add("Orange");
        stringList.add("Green");
        stringList.add("Black");
        System.out.println("Linked list: "+stringList);

        Iterator it= stringList.descendingIterator();

        while (it.hasNext()){
            System.out.println(it.next());

        }





    }
}

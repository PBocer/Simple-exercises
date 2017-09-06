package simpleExercises.collection;


/*
Write a Java program to retrieve an element (at a specified index) from a given array list.

 */

import java.util.ArrayList;
import java.util.List;

public class Collection4 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Blue");
        list.add("Black");
        list.add("Red");
        list.add("Orange");
        list.add("Pink");

        System.out.println(list);

        String element = list.get(0);
        System.out.println("First element: "+ element);

        element = list.get(2);
        System.out.println("Third element: "+ element);

    }


}

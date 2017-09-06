package simpleExercises.collection;


/*
Write a Java program to remove the third element from a array list.
 */

import java.util.ArrayList;
import java.util.List;

public class Collection6 {
    public static void main(String[] args) {

        List<String>stringList= new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Green");
        stringList.add("Orange");
        stringList.add("White");
        stringList.add("Black");

        System.out.println(stringList);

        stringList.remove(2);
        System.out.println("After removing third element from the list:\n"+stringList);
    }
}

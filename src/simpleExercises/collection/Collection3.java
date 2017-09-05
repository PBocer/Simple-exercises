package simpleExercises.collection;

import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to insert an element into the array list at the first position.
 */
public class Collection3 {
    public static void main(String[] args) {

        List<String> stringList= new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Pink");
        stringList.add("Blue");
        stringList.add("Black");

        System.out.println(stringList);

        stringList.add(0,"Gren");
        stringList.add(5,"Orange");

        System.out.println(stringList);

    }

}

package simpleExercises.collection;

import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to create a new array list, add some elements (string) and print out the collection.
 */
public class Collection1 {
    public static void main(String[] args) {

        List<String> listStrings= new ArrayList<>();
        listStrings.add("Red");
        listStrings.add("Black");
        listStrings.add("White");
        listStrings.add("Blue");
        listStrings.add("Orange");
        System.out.println(listStrings);

    }

}

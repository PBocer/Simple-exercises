package simpleExercises.collection;

import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to search an element in a array list.
 */
public class Collection7 {

    public static void main(String[] args) {

        List<String> stringList= new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Green");
        stringList.add("Orange");
        stringList.add("White");
        stringList.add("Black");

        System.out.println(stringList);

        if (stringList.contains("Red")) {
            System.out.println("Found the element");
        }else{
            System.out.println("There is no such element");
        }



    }
}

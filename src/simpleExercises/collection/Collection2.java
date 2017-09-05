package simpleExercises.collection;
/*
Write a Java program to iterate through all elements in a array list.
 */

import java.util.ArrayList;
import java.util.List;

public class Collection2 {
    public static void main(String[] args) {

        List<String> stringList= new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Green");
        stringList.add("Orange");
        stringList.add("White");
        stringList.add("Black");

        for(String element: stringList){
            System.out.println(element);
        }



    }
}

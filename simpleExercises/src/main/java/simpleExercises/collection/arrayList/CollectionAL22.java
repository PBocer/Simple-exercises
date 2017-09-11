package simpleExercises.collection.arrayList;

import java.util.ArrayList;

/*
Write a Java program to print all the elements of a ArrayList using the position of the elements.
 */
public class CollectionAL22 {
    public static void main(String[] args) {

        ArrayList<String>stringList= new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Black");
        stringList.add("Pink");
        stringList.add("Orange");
        System.out.println("First array list: "+ stringList);

        int elemenet= stringList.size();

        for (int index=0;index<elemenet;index++)
            System.out.println(stringList.get(index));


    }
}

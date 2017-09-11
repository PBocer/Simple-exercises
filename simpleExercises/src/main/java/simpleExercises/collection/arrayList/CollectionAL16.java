package simpleExercises.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to clone an array list to another array list.
 */
public class CollectionAL16 {
    public static void main(String[] args) {

        ArrayList<String>stringList= new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Black");
        stringList.add("Blue");
        stringList.add("Green");
        System.out.println("Original array list: "+stringList);

        ArrayList<String>newstringList= (ArrayList<String>)stringList.clone();
        System.out.println(newstringList);

    }
}

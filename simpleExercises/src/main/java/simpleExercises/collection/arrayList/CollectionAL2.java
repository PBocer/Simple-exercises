package simpleExercises.collection.arrayList;


import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to iterate through all elements in a array list.
 */
public class CollectionAL2 {
    public static void main(String[] args) {

        List<String>stringList= new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("Green");
        stringList.add("Pink");
        for (String element:stringList){
            System.out.println(element);
        }
    }
}

package simpleExercises.collection.arrayList;
import java.util.ArrayList;
import java.util.List;
/*
Write a Java program to remove the third element from a array list.
 */

public class CollectionAL7 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("Orange");
        stringList.add("Pink");
        System.out.println(stringList);

        if(stringList.contains("Red")) {
            System.out.println("Found the element");
        }else{
            System.out.println("There is no such element");



        }

    }
}

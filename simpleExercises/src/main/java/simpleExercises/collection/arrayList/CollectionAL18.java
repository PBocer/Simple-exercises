package simpleExercises.collection.arrayList;


import java.util.ArrayList;

/*
Write a Java program to test an array list is empty or not.
 */
public class CollectionAL18 {
    public static void main(String[] args) {
        ArrayList<String>stringList=new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("Pink");
        stringList.add("Orange");
        System.out.println("Original array list: "+ stringList);
        System.out.println("Checking the above array list is empty or not! "+ stringList.isEmpty());

        stringList.removeAll(stringList);

        System.out.println("Array list after remove all elements "+ stringList);
        System.out.println("Checking the above array list is empty or not! "+ stringList.isEmpty());



    }
}

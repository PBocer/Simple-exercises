package simpleExercises.collection.arrayList;


import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to join two array lists.
 */
public class CollectionAL15 {
    public static void main(String[] args) {

        List<String>stringList1= new ArrayList<String>();
        stringList1.add("Red");
        stringList1.add("Orange");
        stringList1.add("White");
        stringList1.add("Pink");
        System.out.println("List of first array: " + stringList1);

        List<String>stringList2= new ArrayList<String>();
        stringList2.add("Black");
        stringList2.add("Purple");
        stringList2.add("Green");
        stringList2.add("Black");
        System.out.println("Second of first array: " + stringList2);

        List<String>stringList3= new ArrayList<String>();
        stringList3.addAll(stringList1);
        stringList3.addAll(stringList2);

        System.out.println("Final list: "+stringList3);




    }
}

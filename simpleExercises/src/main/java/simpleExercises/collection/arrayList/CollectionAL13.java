package simpleExercises.collection.arrayList;


import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to compare two array lists.
 */
public class CollectionAL13 {
    public static void main(String[] args) {

        List<String> stringList1 = new ArrayList<String>();
        stringList1.add("Red");
        stringList1.add("Blue");
        stringList1.add("Green");
        stringList1.add("Black");

        List<String> stringList2 = new ArrayList<String>();
        stringList2.add("Red");
        stringList2.add("Blue");
        stringList2.add("Green");
        stringList2.add("Orange");
        stringList2.add("Black");

        List<String> stringList3 = new ArrayList<String>();
        for (String e : stringList1)
            stringList3.add(stringList2.contains(e) ? "Yes" : "No");
        System.out.println(stringList3);
    }
}






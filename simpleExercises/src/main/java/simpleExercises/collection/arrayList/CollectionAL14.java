package simpleExercises.collection.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Write a Java program of swap two elements in an array list.
 */
    public class CollectionAL14 {
        public static void main(String[] args) {
            List<String>stringList= new ArrayList<String>();
            stringList.add("Red");
            stringList.add("Blue");
            stringList.add("Orange");
            stringList.add("Pink");
            stringList.add("Black");

            System.out.println("Array list before Swap:");
            for (String a:stringList){
                System.out.println(a);
            }

            Collections.swap(stringList,0,2);
            System.out.println("Array list after swap:");
            for (String b:stringList){
                System.out.println(b);
            }



        }
}

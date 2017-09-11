package simpleExercises.collection.arrayList;

import java.util.ArrayList;

public class CollectionAL17 {
    public static void main(String[] args) {

        ArrayList<String>stringList= new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Orange");
        stringList.add("Pink");
        stringList.add("Blue");
        System.out.println("Original array list: "+stringList);

        stringList.removeAll(stringList);
        System.out.println("New list "+ stringList);
    }
}

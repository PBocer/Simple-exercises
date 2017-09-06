package simpleExercises.collection;

/*
Collection6
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection8 {
    public static void main(String[] args) {

        List<String>stringList= new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Green");
        stringList.add("Orange");
        stringList.add("White");
        stringList.add("Black");
        System.out.println(stringList);

        System.out.println("List before sort: "+ stringList);
        Collections.sort(stringList);
        System.out.println("List after sort: "+ stringList);

    }

}

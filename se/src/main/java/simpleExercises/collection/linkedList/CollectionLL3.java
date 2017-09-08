package simpleExercises.collection.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLL3 {
    public static void main(String[] args) {

        LinkedList<String>stringList=  new LinkedList<String>();
        stringList.add("Green");
        stringList.add("Blue");
        stringList.add("Purple");
        stringList.add("Black");
        stringList.add("White");
        System.out.println("List "+stringList);

        Iterator p= stringList.listIterator(1);

        while (p.hasNext()){
            System.out.println(p.next());
        }
    }
}

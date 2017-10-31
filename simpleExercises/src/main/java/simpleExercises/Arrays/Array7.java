package simpleExercises.Arrays;


import java.util.Arrays;

/**
 * Write a Java program to remove a specific element from an array.
 * Napisać program Java, aby usunąć konkretny element tablicy.
 */
public class Array7 {

    public static void main(String[] args) {
        int[]myarray={1,4,2,5,3,43,12,54};

        System.out.println("Array "+ Arrays.toString(myarray));

    int removeIndex=1;

    for (int i=removeIndex;i<myarray.length-1;i++){
        myarray[i]=myarray[i+1];
    }

        System.out.println("New array"+ Arrays.toString(myarray));
    }
}

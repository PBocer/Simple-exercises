package simpleExercises.Arrays;

import java.util.Arrays;

/**
 * Write a Java program to insert an element (specific position) into an array.
 * Napisać program Java, aby wstawić element (określonej pozycji) do tablicy.
 */
public class Array9 {
    public static void main(String[] args) {

        int[]myarray={3,2,5,1,6,8,4,2,3,84,23};

        int Index_positions=2;
        int newValue=8;

        System.out.println("Array"+ Arrays.toString(myarray));

        for (int i=myarray.length-1;i>Index_positions;i--){
            myarray[i]=myarray[i-1];
        }
        myarray[Index_positions]=newValue;
        System.out.println("New array"+Arrays.toString(myarray));
    }
}

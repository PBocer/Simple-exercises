package simpleExercises.Arrays;
/*
Write a Java program to find the duplicate values of an array of integer values.
Napisz program w języku Java, aby znaleźć duplikaty wartości tablicy wartości całkowitych.
 */

public class Array12 {
    public static void main(String[] args) {


        int[]myArray={1,5,3,2,4,5,3,2,};

        for (int i=0;i<myArray.length;i++){
            for (int p=0;p<myArray.length;p++){
                if ((myArray[i]==myArray[p])&&(i!=p)){
                    System.out.println("Duplicate Element : "+myArray[p]);
                }
            }
        }
    }
}

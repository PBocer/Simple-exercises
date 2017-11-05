package simpleExercises.Arrays;


/**
 * Write a Java program to find the maximum and minimum value of an array.
 * Napisać program Java, aby znaleźć maksymalną i minimalną wartość tablicy.
 */

public class Array10 {

    public static void main(String args[]) {
        int array[] = new int[]{10, 11, 88, 2, 12, 120};

        int min = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[0]<min)
                min=array[i];

            }
        System.out.println("Min"+ min);

        int max = array[0];

        for (int i=0;i<array.length;i++){
            if (array[0]> max)
                max=array[0];
        }
        System.out.println("Max "+max);
        }



    }


package simpleExercises.Arrays;

/**
 Write a Java program to sum values of an array.
 */
public class Array2 {
    public static void main(String[] args) {

        int[]myArray={1,2,3,4,5,6,7,8,9,10};
        int sum=0;


        for(int i: myArray)
            sum += i;
        System.out.println("Sum= "+ sum);

    }
}





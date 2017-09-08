package simpleExercises.Arrays;

/**
 Write a Java program to calculate the average value of array elements.
 */
public class Array4 {
    public static void main(String[] args) {

        int tablica[]= new int[]{20, 30, 25, 35, -16, 60, -100};

        int sum=0;

        for(int i=0;i<tablica.length;i++)

        sum= sum + tablica[i];

        double average= sum/tablica.length;

        System.out.println("Average= "+ average);





    }





}

package simpleExercises.Arrays;

/*
Write a Java program to find the duplicate values of an array of string values.
Napisz program w języku Java, aby znaleźć zduplikowane wartości tablicy wartości łańcuchowych.
 */
public class Array13 {
    public static void main(String[] args) {

        String[]myArray= {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
        for (int i=0;i<myArray.length;i++){
            for (int p=0;p<myArray.length;p++){
                if (myArray[i].equals(myArray[p])&&(i!=p)){
                    System.out.println("Duplicate Element is : "+ myArray[p]);
                }
            }
        }


    }
}

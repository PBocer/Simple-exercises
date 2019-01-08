package simpleExercises.Arrays;


import java.util.HashSet;

/**
 *  14. Write a Java program to find the common elements between two arrays (string values)
 *  Napisz program w języku Java, aby znaleźć wspólne elementy między dwiema tablicami (wartości łańcuchowe).
 */
public class Array14 {

    public static void main(String[] args) {

        String [] array1 = {"Tomek", "Asia", "Bartek", "Juzio"};

        String [] array2 = {"Edek", "Asia", "marcel", "Juzio"};


        HashSet<String> hashSet= new HashSet<String>();


        for (int i=0;i<array1.length;i++){
            for (int j=0;j<array2.length;j++){
                if (array1[i].equals(array2[j]))

                    hashSet.add(array1[i]);
            }
        }

        System.out.println(hashSet);

    }
}

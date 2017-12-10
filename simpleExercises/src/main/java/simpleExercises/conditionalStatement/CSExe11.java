package simpleExercises.conditionalStatement;


/**
 Write a Java program to create a new String object with the contents of a character array.
 Napisz program w języku Java, aby utworzyć nowy obiekt String z zawartością tablicy znaków.
 */
public class CSExe11 {
    public static void main(String[] args) {


        char[]myArray= new char[]{'1','2','3','4'};

        String myString= String.copyValueOf(myArray,1,3);

        System.out.println(myString);
    }
}

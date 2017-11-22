package simpleExercises.Strings;

/**
 * Write a Java program to get the contents of a given string as a character array.
 Napisz program w języku Java, aby pobrać zawartość danego ciągu znaków jako tablicę znaków.
 */
public class String17 {
    public static void main(String[] args) {

        String str="This is a sample string.";

        char []array= new char []{ ' ', ' ', ' ', ' ',' ', ' ', ' ', ' ' };

        str.getChars(4, 10, array, 2);

        System.out.println("The char array equals " + array);

    }
}

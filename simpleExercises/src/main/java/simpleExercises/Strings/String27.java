package simpleExercises.Strings;

/**
 * Write a Java program to get a substring of a given string between two specified positions.
 * Napisz program w języku Java, aby uzyskać podciąg danego łańcucha między dwiema określonymi pozycjami.
 *
 */

public class String27 {
    public static void main(String[] args) {

        String str = "The quick brown fox jumps over the lazy dog.";

        String newStr= str.substring(10,26);

        System.out.println(str);
        System.out.println(newStr);
    }
}

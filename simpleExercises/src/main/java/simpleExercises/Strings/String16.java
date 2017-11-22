package simpleExercises.Strings;

/**
 * Write a Java program to get the contents of a given string as a byte array.
 * Napisz program w języku Java, aby pobrać zawartość danego ciągu znaków jako tablicę bajtów.
 */
public class String16 {
    public static void main(String[] args) {
        String string = "This is a sample String.";

        byte[]byteArray= string.getBytes();

        String newString= new String(byteArray);

        System.out.println(newString);
    }
}

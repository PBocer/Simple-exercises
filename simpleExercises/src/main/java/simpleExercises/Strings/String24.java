package simpleExercises.Strings;

/**
 * Write a Java program to replace all the 'd' characters with 'f' characters.
 * Napisz program w języku Java, który zastąpi wszystkie znaki "d" znakami "f".
 */
public class String24 {
    public static void main(String[] args) {

        String string = "The quick brown fox jumps over the lazy dog.";

        String newString=string.replace('d','f');

        System.out.println("Old string: "+ string);
        System.out.println("New string: "+ newString);
    }
}

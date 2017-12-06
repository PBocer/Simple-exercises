package simpleExercises.Strings;

/**
 * Write a Java program to trim any leading or trailing whitespace from a given string.
 * Napisz program w języku Java, aby przyciąć wszystkie wiodące lub końcowe białe znaki z danego ciągu znaków.
 */

public class String31 {
    public static void main(String[] args) {

        String string = " Java Exercises ";

        String newString= string.trim();


        System.out.println(string);
        System.out.println(newString);
    }
}

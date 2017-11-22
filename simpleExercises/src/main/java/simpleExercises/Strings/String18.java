package simpleExercises.Strings;

/**
 * Write a Java program to create a unique identifier of a given string.
 Napisz program w języku Java, aby utworzyć unikalny identyfikator danego łańcucha.

 */

public class String18 {
    public static void main(String[] args) {


        String string="Python Exercises.";

        int hashCode= string.hashCode();

        System.out.println("This is hash code "+hashCode);
    }
}

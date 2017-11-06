package simpleExercises.Strings;

/**
 * Write a Java program to test if a given string contains the specified sequence of char values.
 * Napisać program Java, aby sprawdzić, czy dany ciąg zawiera określony ciąg wartości char.
 */

public class String8 {

    public static void main(String[] args) {


        String str1 = "PHP Exercises and Python Exercises";
        String str2 = "and";
        System.out.println("Original String: " + str1);
        System.out.println("Specified sequence of char values: " + str2);
        System.out.println(str1.contains(str2));

    }
}

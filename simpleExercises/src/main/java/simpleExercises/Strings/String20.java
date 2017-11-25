package simpleExercises.Strings;

/**
 * Write a Java program to get the canonical representation of the string object.
 * Napisz program w języku Java, aby uzyskać kanoniczną reprezentację obiektu typu string.
 */
public class String20 {
    public static void main(String[] args) {


        String string1 = "Java Exercises";
        String string2 = new StringBuffer("Java").append("Exercises").toString();
        String string3 = string2.intern();
        System.out.println("str1 == str2? " + (string1 == string2));
        System.out.println("str1 == str3? " + (string1 == string3));

    }
}
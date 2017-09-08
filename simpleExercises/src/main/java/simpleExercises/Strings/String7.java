package simpleExercises.Strings;

/**
 Write a Java program to concatenate a given string to the end of another string.
 */
public class String7 {

    public static void main(String[] args) {

        String str1 = "PHP Exercises and";
        String str2 = "Python Exercises";

        String str3= str1.concat(str2);

        System.out.println(str3);
    }

}

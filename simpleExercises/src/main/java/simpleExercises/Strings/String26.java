package simpleExercises.Strings;

/**
 *Write a Java program to check whether a given string starts with the contents of another string.
 * Napisz program Java, aby sprawdzić, czy dany ciąg rozpoczyna się od zawartości innego ciągu.
 */

public class String26 {
    public static void main(String[] args) {


        String str1 = "Red is favorite color.";
        String str2 = "Orange is also my favorite color.";

        String startStr = "Red";

        boolean startStr1=str1.startsWith(startStr);
        boolean startSrt2=str2.startsWith(startStr);

        System.out.println(startStr1);
        System.out.println(startSrt2);
    }
}

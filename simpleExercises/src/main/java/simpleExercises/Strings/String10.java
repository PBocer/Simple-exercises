package simpleExercises.Strings;

/**
 * Write a Java program to compare a given string to the specified string buffer.
 * Napisać program Java, aby porównać dany ciąg do określonego bufora strun.
 */

public class String10 {
    public static void main(String[] args) {

        String str1 = "example.com";
        String str2 = "Example.com";
        StringBuffer strbuf= new StringBuffer(str1);

        System.out.println("Comparing "+str1+" and "+strbuf+": " + str1.contentEquals(strbuf));

        System.out.println("Comparing "+str2+" and "+strbuf+": " + str2.contentEquals(strbuf));

    }
}

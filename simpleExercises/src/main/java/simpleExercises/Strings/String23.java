package simpleExercises.Strings;

/**
 Write a Java program to find whether a region in the current string matches a region in another string.
 Napisz program w języku Java, aby sprawdzić, czy region w bieżącym łańcuchu pasuje do regionu w innym ciągu.
 */

public class String23 {
    public static void main(String[] args) {

        String str1 = "Shanghai Houston Colorado Alexandria";
        String str2 = "Alexandria Colorado Houston Shanghai";

        boolean match1= str1.regionMatches(0,str2,28,8);
        boolean match2=str1.regionMatches(9, str2, 9, 8);
    }
}

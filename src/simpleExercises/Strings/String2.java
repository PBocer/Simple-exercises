package simpleExercises.Strings;

/**
 Write a Java program to get the character (Unicode code point) at the given index within the String.
 */
public class String2 {
    public static void main(String[] args) {
        String str = "w3resource.com";
        System.out.println("Original String : " + str);


        int index1= str.charAt(1);
        int index2= str.charAt(9);


        System.out.println("Character(unicode point) = " + index1);
        System.out.println("Character(unicode point) = " + index2);

    }



}

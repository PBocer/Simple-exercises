package simpleExercises.Strings;

/**
 * Write a Java program to create a new String object with the contents of a character array.
 * (Napisz program w języku Java, aby utworzyć nowy obiekt String z zawartością tablicy znaków.)
 */
public class String11 {
    public static void main(String[] args) {


        char[] array = new char[]{'1','4','2','4'};

        String str = String.copyValueOf(array,1,3);
        System.out.println(str);


    }
}
package simpleExercises.Strings;

/**
 * Write a Java program to check whether a given string ends with the contents of another string.
 * (Napisz program w języku Java, aby sprawdzić, czy dany ciąg kończy się zawartością innego ciągu.)

 */
public class String12 {
    public static void main(String[] args) {

        String str1 = "Python Exercises";
        String str2 = "Python Exercise";

        String end= "es";

        boolean end1= str1.endsWith(end);
        boolean end2=str2.endsWith(end);


        System.out.println(end1);
        System.out.println(end2);

    }
}

package simpleExercises.conditionalStatement;

/**
 * Write a Java program to check whether a given string ends with the contents of another string.
 * Napisz program w języku Java, aby sprawdzić, czy dany ciąg kończy się zawartością innego ciągu.
 */
public class CSExe12 {
    public static void main(String[] args) {


        String string1 = "Python Exercises";
        String string2 = "Python Exercise";

        String endString="se";

        boolean end1= string1.endsWith(endString);
        boolean end2= string2.endsWith(endString);

        System.out.println(end1);
        System.out.println(end2);


    }
}

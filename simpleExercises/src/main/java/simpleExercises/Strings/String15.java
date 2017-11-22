package simpleExercises.Strings;

import java.util.Calendar;

/**
 * Write a java program to print current date and time in the specified format.
 * Napisz program java, aby wydrukować bieżącą datę i godzinę w określonym formacie.

 *
 */
public class String15 {
    public static void main(String[] args) {

        Calendar c= Calendar.getInstance();

        System.out.println("Current Date and Time :");
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
    }

    }

package simpleExercises.dateTypes;


import java.util.Scanner;

/**
 Write a Java program to convert minutes into a number of years and days.
 */
public class DateTypesExe4 {
    public static void main(String[] String) {

        double minuteInYear= 60*24* 365;

        Scanner scanner = new Scanner (System.in);
        System.out.print("Input the number of minutes: ");

        double min = scanner.nextDouble();

        long years= (long)(min/minuteInYear);
        int days = (int)(min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");



    }

}

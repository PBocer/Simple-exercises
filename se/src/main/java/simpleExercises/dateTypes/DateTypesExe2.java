package simpleExercises.dateTypes;

import java.util.Scanner;

/**
 Write a Java program that reads a number in inches, converts it to meters.
 Note: One inch is 0.0254 meter.

 Test Data
 Input a value for inch: 1000
 */
public class DateTypesExe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Input a value for inch:  ");
        double inches= scanner.nextDouble();

        double meters= inches*0.0254;

        System.out.println(inches + " inches is " + meters + " metres");

    }


}

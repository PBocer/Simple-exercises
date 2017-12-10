package simpleExercises.conditionalStatement;

import java.util.Scanner;

/**
 * Write a Java program that takes a year from user and print whether that year is a leap year or not.
 Test Data
 Input the year: 2016


 Napisz program Java, który zajmuje rok od użytkownika i wydrukuj, czy ten rok jest rokiem przestępnym czy nie.
 Dane testowe Wprowadź
 rok: 2016
 */

public class CSExe9 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int years = scanner.nextInt();

        boolean x = (years % 4) == 0;
        boolean y = (years % 100) != 0;
        boolean z = ((years % 100 == 0) && (years % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(years + " is a leap year");
        }
        else
        {
            System.out.println(years + " is not a leap year");
        }
    }
}
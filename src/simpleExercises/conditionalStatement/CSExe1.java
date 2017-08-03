package simpleExercises.conditionalStatement;

import java.util.Scanner;
/*
Write a Java program to test a number is positive or negative.

Test Data
Input number: 35
 */
public class CSExe1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = in.nextInt();

        if (input > 0)
        {
            System.out.println("Number is positive");
        }
        else if (input < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }

    }

}


package simpleExercises.dateTypes;

import java.util.Scanner;

/**
 Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

 Test Data
 Input an integer between 0 and 1000: 565
 */
public class DateTypesExe3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println(" Input an integer between 0 and 1000: ");


        int num= scanner.nextInt();

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;

        int sum = thirdDigit + SecondDigit + firstDigit;

        System.out.println("The sum of all digits in " + num + " is " + sum);

    }
}


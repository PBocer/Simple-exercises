package simpleExercises.method;

import java.util.Scanner;

/**
 Write a Java method to compute the average of three numbers.

 Test Data:
 Input the first number: 25
 Input the second number: 45
 Input the third number: 65
 */
public class MethodExe2 {
    public static void main(String[] args) {
    Scanner scanner= new Scanner (System.in);
        System.out.println("iInput the first number:  ");
        double x= scanner.nextDouble();
        System.out.println("Input the second number:  ");
        double y= scanner.nextDouble();
        System.out.println("Input the first number:   ");
        double z= scanner.nextDouble();
        System.out.println("The average value is " + average(x,y,z)+"/n");



    }
    public static double average(double x, double y, double z ){
        return (x+y+z)/3;
    }



}

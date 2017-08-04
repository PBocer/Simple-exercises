package simpleExercises.method;


import java.util.Scanner;

/*
Write a Java method to find the smallest number among three numbers.

Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
 */
public class MethodExe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number ");
        double x = scanner.nextDouble();
        System.out.println("Input second sumber ");
        double y = scanner.nextDouble();
        System.out.println("Input third number ");
        double z = scanner.nextDouble();

        System.out.println("The smallest value is " + smallest(x, y, z)+"\n" );

    }

    public static double smallest(double x, double y, double z) {



        return Math.min(Math.min(x,y), z);
    }


}

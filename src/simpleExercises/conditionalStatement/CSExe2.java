package simpleExercises.conditionalStatement;

import java.util.Scanner;




/**
 Write a Java program to solve quadratic equations (use if, else if and else).

 Test Data
 Input a: 1
 Input b: 5
 Input c: 1
 */
public class CSExe2 {
    public static void main(String[] String) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add a");
        double a= scanner.nextDouble();
        System.out.println("Add b");
        double b= scanner.nextDouble();
        System.out.println("Add c");
        double c= scanner.nextDouble();

        double result= b*b -4*a*c;

        if(result>0.0){
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("result : "+ r1 + "result   :" + r2);
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }


        }





    }





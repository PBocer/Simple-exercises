package simpleExercises.conditionalStatement;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

/*Write a Java program to to find the largest of three numbers.

 Test Data
 Input the 1st number: 25
 Input the 2nd number: 78
 Input the 3rd number: 87
 */
public class CSExe3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the 1st number: ");
        int num1= scanner.nextInt();

        System.out.println("Input the 2st number: ");
        int num2= scanner.nextInt();

        System.out.println("Input the 3st number: ");
        int num3= scanner.nextInt();


        if(num1>num2)
            if(num1>num3)
                System.out.println("this number is greatest  " + num1);

        if(num2>num1)
            if(num2>num3)
                System.out.println("this number is greatest  " + num2);

        if(num3>num1)
            if(num3>num2)
                System.out.println("this number is greatest  " + num3);
    }
}

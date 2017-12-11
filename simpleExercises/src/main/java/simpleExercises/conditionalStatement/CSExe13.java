package simpleExercises.conditionalStatement;

import java.util.Scanner;

/**
 Write a program in Java to display the cube of the number upto given an integer.
 Test Data
 Input number of terms : 4\

 Napisz program w Javie, aby wyświetlić szescian liczby do góry, aby podać liczbę całkowitą.
 Dane testowe
 Wprowadź liczbę haseł: 4
 */
public class CSExe13 {
    public static void main(String[] args) {


        int n;
        int i;


        Scanner scanner= new Scanner(System.in);

        n = scanner.nextInt();

        for ( i=1;i<=n;i++) {
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + (i * i * i));
        }
    }



}


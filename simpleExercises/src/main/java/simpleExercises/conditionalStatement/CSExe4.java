package simpleExercises.conditionalStatement;

import java.util.Scanner;

/**
 * Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
 * Otherwise, print "positive" or "negative".
 * Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
 Test Data
 Input value: 25


 Napisać program Java, który czyta liczbę zmiennoprzecinkową i drukuje „zero”, jeśli liczba jest równa zero.
 W przeciwnym razie, print „pozytywny” lub „negatywny”.
 Dodaj „mały”, jeżeli wartość bezwzględna liczba jest mniejsza niż 1, lub „duże” jeśli przekracza 1.000.000.

 Dane testu
 wartość wejściowa: 25
 */
public class CSExe4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input value: ");
        double input=in.nextDouble();

        if (input>0){
            if (input<1){
                System.out.println("Small number");
            }else if (input>1000000){
                System.out.println("Big number");
            }else{
                System.out.println("Posotiv number");
            }
        }
        else if (input<0){
            if (Math.abs(input)<1)
                if (Math.abs(input) < 1)
                {
                    System.out.println("Negative small number");
                }
                else if (Math.abs(input) > 1000000)
                {
                    System.out.println("Negative large number");
                }
                else
                {
                    System.out.println("Negative number");
                }
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
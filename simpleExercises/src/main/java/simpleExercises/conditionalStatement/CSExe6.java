package simpleExercises.conditionalStatement;
/*
Write a Java program that reads in two floating-point numbers and
tests whether they are the same up to three decimal places.
Test Data
Input floating-point number: 1256
Input floating-point another number: 3254

Napisz program w języku Java, który odczytuje dwie liczby zmiennoprzecinkowe
i sprawdza, czy są one takie same, aż do trzech miejsc po przecinku.
 Dane testowe Liczba zmiennoprzecinkowa: 1256
 Wprowadź zmiennoprzecinkowy inny numer: 3254

 */


import java.util.Scanner;

public class CSExe6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input floating-point number: ");
        double x = scanner.nextDouble();

        System.out.println("Input floating-point another number: ");
        double y = scanner.nextDouble();

        x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");

        }
    }
}


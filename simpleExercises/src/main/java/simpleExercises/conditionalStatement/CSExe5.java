package simpleExercises.conditionalStatement;
/*
Write a Java program that keeps a number from the user and generates an integer between 1 and 7
and displays the name of the weekday.
Test Data
Input number: 3

Napisz program w języku Java, który przechowuje numer od użytkownika i generuje liczbę całkowitą od 1 do 7
i wyświetla nazwę dnia tygodnia.
Dane testowe Numer wejścia: 3
 */


import java.util.Scanner;

public class CSExe5 {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        System.out.println("Input number: ");
        int day= scanner.nextInt();
        System.out.println(getDayName(day));

    }
    public static String getDayName(int day){
        String dayName="";
        switch (day){
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";

        }
        return dayName;

    }

}

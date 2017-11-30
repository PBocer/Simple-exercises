package simpleExercises.conditionalStatement;

import java.util.Scanner;

/**
 Write a Java program to find the number of days in a month.

 Test Data
 Input a month number: 2
 Input a year: 2016

 Napisz program w języku Java, aby znaleźć liczbę dni w miesiącu.
 Dane testowe
 Wprowadź numer miesiąca: 2
 Wprowadź rok: 2016
 */

public class CSExe7 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

            int numberOFDayInMonth=0;
            String nameOfMonth="Unknown";

            System.out.println("Input a month number");
        int month= scanner.nextInt();

        System.out.println("Input o year");
        int year= scanner.nextInt();


        switch (month){
            case 1:
                nameOfMonth = "January";
                numberOFDayInMonth = 31;
                break;
            case 2:
                nameOfMonth = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberOFDayInMonth = 29;
                } else {
                    numberOFDayInMonth = 28;
                }
                break;
            case 3:
                nameOfMonth = "March";
                numberOFDayInMonth = 31;
                break;
            case 4:
                nameOfMonth = "April";
                numberOFDayInMonth = 30;
                break;
            case 5:
                nameOfMonth = "May";
                numberOFDayInMonth = 31;
                break;
            case 6:
                nameOfMonth = "June";
                numberOFDayInMonth = 30;
                break;
            case 7:
                nameOfMonth = "July";
                numberOFDayInMonth = 31;
                break;
            case 8:
                nameOfMonth = "August";
                numberOFDayInMonth = 31;
                break;
            case 9:
                nameOfMonth = "September";
                numberOFDayInMonth = 30;
                break;
            case 10:
                nameOfMonth = "October";
                numberOFDayInMonth = 31;
                break;
            case 11:
                nameOfMonth = "November";
                numberOFDayInMonth = 30;
                break;
            case 12:
                nameOfMonth = "December";
                numberOFDayInMonth = 31;
        }
        System.out.print(nameOfMonth + " " + year + " has " + numberOFDayInMonth + " days\n");
    }
}


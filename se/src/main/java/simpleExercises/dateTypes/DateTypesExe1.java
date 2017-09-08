package simpleExercises.dateTypes;
import java.util.Scanner;

//Write a Java program to convert temperature from Fahrenheit to Celsius degree.

//Test Data
  //      Input a degree in Fahrenheit: 212



public class DateTypesExe1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        System.out.println("Input a degree in Fahrenheit:  ");
        double fahrenheit= scanner.nextDouble();


        double celsius = (5 * (fahrenheit-32))/9;
        System.out.println(fahrenheit + "  degree Fahrenheit is equal to " + celsius + "in Celsius");



    }

}

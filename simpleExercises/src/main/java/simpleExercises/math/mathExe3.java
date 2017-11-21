package simpleExercises.math;

/*
Write a Java program to test if a double number is an integer.
Napisz program Java, aby sprawdzić, czy podwójna liczba jest liczbą całkowitą.
 */

public class mathExe3 {
    public static void main(String[] args) {

        double thisNumber= 5.4324;

        if ((thisNumber % 1)==0){
            System.out.println("It's not a double number");
        }else{
            System.out.println("This is double number");
        }
    }
}

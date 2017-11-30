package simpleExercises.math;


import java.math.BigDecimal;

/**
 * Write a Java program to round a float number to specified decimals.
 * Napisz program w języku Java, aby zaokrąglić liczbę zmiennoprzecinkową do określonych liczb dziesiętnych.

 */
public class mathExe4 {
    public static void main(String[] args) {
        float number= 451.5235362f;
        BigDecimal result;
        int decimalPlace= 4;
        BigDecimal dbNumber= new BigDecimal(Float.toString(number));
        dbNumber = dbNumber.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        System.out.printf("Original number: %.7f\n",number);
        System.out.println("Rounded upto 4 decimal: "+dbNumber);
    }
}

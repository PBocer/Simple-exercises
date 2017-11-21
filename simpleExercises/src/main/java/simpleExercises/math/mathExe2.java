package simpleExercises.math;

/*
Write a Java program to get whole and fractional parts from a double value.
Napisz program Java, aby uzyskać częściowe i ułamkowe części z podwójnej wartości.
 */

public class mathExe2{
    public static void main(String[] args) {

        double value = 12.56;
        double fractional_part= value % 1;
        double integral_part= value-fractional_part;

        System.out.print("\nOriginal value: "+value);
        System.out.print("\nIntegral part: "+integral_part);
        System.out.print("\nFractional part: "+fractional_part);


    }

}

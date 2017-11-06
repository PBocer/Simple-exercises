package simpleExercises.method;

/**
 * Write a Java method to compute the sum of the digits in an integer.
 Test Data:
 Input an integer: 25

 (Napisać metodę Java, aby obliczyć sumę cyfr liczby całkowitej.
 Dane Test:
 Wejście liczbą całkowitą: 25)
 */

public class MethodExe6 {
    public static void main(String[] args) {


    int num = 25;
    int sum = 0;
        while (num > 0) {
        sum = sum + num % 10;
        num = num / 10;
    }
        System.out.println(sum);
}
}

import java.util.Scanner;
package conditionaStatement;

/**
 * Created by Johny on 27.07.2017.
 */
public class scExe1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = in.nextInt();

        if (input > 0)
        {
            System.out.println("Number is positive");
        }
        else if (input < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
}

package simpleExercises.math;

/*
Write a Java program to round up the result of integer division.
Napisz program Java, aby zaokrąglić wynik podziału całkowitoliczbowego.
 */
public class mathExe1 {
    public static void main(String[] args) {

        int tot_theory_marks = 350;
        int tot_practical_marks = 90;
        int tot_marks = 500;

        int percentage_of_marks=((tot_theory_marks+tot_practical_marks)*100)/tot_marks;
        System.out.println(percentage_of_marks+" %");

    }
}

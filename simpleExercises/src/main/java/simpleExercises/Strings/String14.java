package simpleExercises.Strings;

/**
 * Write a Java program to compare a given string to another string, ignoring case considerations.
 * Napisz program w języku Java, aby porównać dany ciąg do innego ciągu, ignorując rozważania dotyczące spraw.
 */
public class String14 {
    public static void main(String[] args) {

        String string1 = "Stephen Edwin King";
        String string2 = "Walter Winchell";
        String string3 = "stephen edwin king";

        boolean equals1=string1.equalsIgnoreCase(string2);
        boolean equals2=string1.equalsIgnoreCase(string3);

        System.out.println(string1+" equals "+ string2 + " ? "+equals1);
        System.out.println(string1+" equals "+ string3 + " ? "+equals2);


    }
}

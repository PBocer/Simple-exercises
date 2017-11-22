package simpleExercises.Strings;


/**
 * Write a Java program to check whether two String objects contain the same data.
 * Napisz program Java, aby sprawdzić, czy dwa obiekty String zawierają te same dane.

 */
public class String13 {
    public static void main(String[] args) {
        String string1 = "Stephen Edwin King";
        String string2 = "Walter Winchell";
        String string3 = "Mike Royko";


        boolean equals1= string1.equals(string2);
        boolean equals2= string2.equals(string3);


        System.out.println(string1+ " equals "+string2+" ? "+ equals1);
        System.out.println(string2+ " equals "+string3+" ? "+ equals2);
    }
}


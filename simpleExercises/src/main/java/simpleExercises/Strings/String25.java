package simpleExercises.Strings;

/**
 * Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
 Sample string: "The quick brown fox jumps over the lazy dog."
 In the above string replace all the fox with cat.
 \
 Napisz program Java, który zastąpi każdy podciąg danego ciągu, który pasuje do danego wyrażenia regularnego z podanym zamiennikiem.
 Przykładowy ciąg: "Szybki brązowy lis przeskakuje nad leniwym psem".
 W powyższym łańcuchu zamień lisa na kota.
 */

public class String25 {
    public static void main(String[] args) {

        String string="The quick brown fox jumps over the lazy dog.";
        String newString=string.replaceAll("fox","cat");


    }
}

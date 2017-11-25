package simpleExercises.Strings;

/**
 * Write a Java program to get the index of all the characters of the alphabet.
 Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."

 Napisz program w języku Java, aby uzyskać indeks wszystkich znaków alfabetu.
 Przykładowy ciąg wszystkich alfabetów: "Szybki brązowy lis przeskakuje nad leniwym psem".
 */


public class String19 {
    public static void main(String[] args) {
        String string = "The quick brown fox jumps over the lazy dog.";
        int a = string.indexOf("a", 0);
        int b = string.indexOf("b", 0);
        int c = string.indexOf("c", 0);
        int d = string.indexOf("d", 0);
        int e = string.indexOf("e", 0);
        int f = string.indexOf("f", 0);
        int g = string.indexOf("g", 0);
        int h = string.indexOf("h", 0);
        int i = string.indexOf("i", 0);
        int j = string.indexOf("j", 0);
        int k = string.indexOf("k", 0);
        int l = string.indexOf("l", 0);
        int m = string.indexOf("m", 0);
        int n = string.indexOf("n", 0);
        int o = string.indexOf("o", 0);
        int p = string.indexOf("p", 0);
        int q = string.indexOf("q", 0);
        int r = string.indexOf("r", 0);
        int s = string.indexOf("s", 0);
        int t = string.indexOf("t", 0);
        int u = string.indexOf("u", 0);
        int v = string.indexOf("v", 0);
        int w = string.indexOf("w", 0);
        int x = string.indexOf("x", 0);
        int y = string.indexOf("y", 0);
        int z = string.indexOf("z", 0);

        System.out.println(" a  b c  d e  f  g h i  j");
        System.out.println("=========================");
        System.out.println(a + " " + b + " " + c + " " + d + " " +
                e + " " + f + " " + g + " " + h + " " +
                i + " " + j + "\n");

        System.out.println("k  l  m  n  o  p q  r  s  t");
        System.out.println("===========================");
        System.out.println(k + " " + l + " " + m + " " + n + " " +
                o + " " + p + " " + q + " " + r + " " +
                s + " " + t + "\n");

        System.out.println("u  v  w  x  y  z");
        System.out.println("================");
        System.out.println(u + " " + v + " " + w + " " + x + " " +
                y + " " + z);
    }
}

package simpleExercises.method;


import java.util.StringTokenizer;

/**
 * Write a Java method to count all words in a string.
 Test Data:
 Input the string: The quick brown fox jumps over the lazy dog.

 (Napisać metodę Java, aby policzyć wszystkie słowa sznurku.
 Test Data:
 Wprowadź ciąg znaków: Szybki brązowy lis przeskoczył nad leniwym psem.)
 */
public class MethodExe5 {

    public static void main(String[] args) {
        String s1= "The quick brown fox jumps over the lazy dog";

        System.out.println("String contain "+ countWord(s1)+ " words");

    }


    public static int countWord(String str){
        StringTokenizer stringTok= new StringTokenizer(str);

        return stringTok.countTokens();
    }
}

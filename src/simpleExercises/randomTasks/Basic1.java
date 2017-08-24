package simpleExercises.randomTasks;

import java.util.Random;
import java.util.Scanner;

/**
 * Napisz program losujący 30 elementówwtablicy.
 * Program ma zapytać użytkownika o liczbę i dać odpowiedź ,czy podana liczba znajduje się w tablicy
 * <p>
 * Losowanie liczb
 */
public class Basic1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] tablica = new int[30];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt();

        }
        System.out.println("Sprawdze czy takie jest");
        int szukanaLiczba = scanner.nextInt();
        boolean czyObecna = false;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == szukanaLiczba) {
                czyObecna = true;
                break;

            }
        }
        if (czyObecna) {
            System.out.println("Mam taka liczbe");
        } else {
            System.out.println("Nie ma takiej liczby");
        }
    }
}





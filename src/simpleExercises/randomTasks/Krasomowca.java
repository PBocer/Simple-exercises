package simpleExercises.randomTasks;

/**
 * Created by Johny on 23.08.2017.
 */
public class Krasomowca {
    public static void main(String[] args) {


    String[] listaSlow1 = {"architektura wielowarstwowa", "30000 metrów","rozwiazanie B-do-B","przenikliowsci"};
    String[] listaSlow2 = {"zwieksza mozliwosci", "poprawia atrakcyjnosc","pomnaza wartosc"};
    String[] listaSlow3 = {"procesu", "punktu wpisywania","rozwiazania","strategii"};


    int lista1Dlugosci = listaSlow1.length;
    int lista2Dlugosci = listaSlow2.length;
    int lista3Dlugosci = listaSlow3.length;

    int rnd1 = (int) (Math.random() * lista1Dlugosci);
    int rnd2 = (int) (Math.random() * lista2Dlugosci);
    int rnd3 = (int) (Math.random() * lista3Dlugosci);

    String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + " " + listaSlow3[rnd3];

    System.out.println("To jest to, czego nam trzeba: "+zdanie);

}
}

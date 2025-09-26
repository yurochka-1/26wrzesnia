import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //wylosuj 10 liczb i zapisz je w tablicy
        int[] wylosowaneLiczby = wylosujLiczbyDoTablicy(10);
        //wypisywanie tablicy
        wypisz(wylosowaneLiczby);
        //wylosuj 50 liczb bez powtorzen
        ArrayList<Integer> wylosowaneLiczbyLista = losujLiczbeBezPowtorzen(50);
        wypisz(wylosowaneLiczbyLista);
        //wylosuj 30 liczb bez powtorzen ->zbiory
        //HashSet zbiory - kolekcja, elementy się nie powtarzają nie są indeksowane
    }
    static HashSet<Integer> losujLiczbyBezPowtorzenDoZbioru(int ileLiczb){
        HashSet<Integer> wylosowaneLiczby = new HashSet<>();
        Random random = new Random();
        while (wylosowaneLiczby.size()<ileLiczb){
            wylosowaneLiczby.add(random.nextInt(100)+1);
        }
        return wylosowaneLiczby;
    }
    static ArrayList<Integer> losujLiczbeBezPowtorzen(int ileLiczb){
        Random random = new Random();
        ArrayList<Integer> wylosowaneLiczby = new ArrayList<>();
        for (int i = 0; i < ileLiczb; i++) {
            int liczba = random.nextInt(100) + 1;
            if (wylosowaneLiczby.contains(liczba)) {
                liczba = random.nextInt(100) + 1;
            }
            wylosowaneLiczby.add(liczba);
        }
        return  wylosowaneLiczby;
    }

    static void wypisz(int[] tablica){
        System.out.println("Wylosowane liczby:");
        for (int elementTablicy:tablica) {
            //typ nazwaelementu:tablica/kolekcja
            System.out.print(elementTablicy+", ");
        }
    }

    static void wypisz(ArrayList<Integer> lista){
        System.out.println("Lista: ");
        for (int element:lista) {
            System.out.println(element+", ");

        }
    }
    static int[] wylosujLiczbyDoTablicy(int ileLiczb)
    {
        Random random = new Random();
        int[] tablicaLosowych = new int[ileLiczb];
        for (int i = 0; i < tablicaLosowych.length; i++) {
            tablicaLosowych[i] = random.nextInt(100)+1;
        }
        return tablicaLosowych;
    }
}
package pl.infoshare.structures._4_sets._3_exercise;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsExercise1 {

    // TODO: Ćwiczenie 5 - Sets API
    // TODO: 1. Utwórz nowy HashSet przechowujący Integery. Dodaj do niego liczby 2, 7, 3, 1, 1
    // TODO: 2. Sprawdź rozmiar seta
    // TODO: 3. Utwórz nowy LinkedHashSet przechowujący Integery. Dodaj do niego te same liczby.
    // TODO: 4. Wypisz po kolei wszystkie obu utworzonych setów
    public static void main(String[] args) {

        Set<City> citySet = new TreeSet<>();

        citySet.add(new City("Gdańsk",1234));
        citySet.add(new City("Gdynia",342334));
        citySet.add(new City("Gdańsk",1234));
        citySet.add(new City("Sopot",1234));

        System.out.println(citySet.size());
        System.out.println(citySet);

        City city = new City("Gadńsk",1234);
        System.out.println(city.compareTo(new City("Gdańsk", 1234)));

    }
}

package pl.infoshare.structures._3_maps._3_exercise;

import java.util.HashMap;
import java.util.Map;

public class MapsExercise1 {

    // TODO: Ćwiczenie 3 - Map API
    // TODO: 1. Utwórz nową HashMapę City od Integer (liczba mieszkańców)
    // TODO: 2. Dodaj do mapy trzy trójmiejskie miasta wraz z liczba ich mieszkancow
    // TODO: 3. Zaktualizuj liczbę mieszkańców Gdyni do 150
    // TODO: 4. Zaktualizuj liczbę mieszkańców Wejherowa do 36000 tylko jeżeli miasto nie było wcześniej dodane do mapy
    // TODO: 5. Zaktualizuj liczbę mieszkańców Gdańska do 100000 tylko jeżeli miasto nie było wcześniej dodane do mapy
    // TODO: 6. Wypisz na ekran tylko miasta
    // TODO: 7. Wypisz na ekran tylko ilość mieszkańców
    // TODO: 8. Wypisz na ekran dane dla Gdańska, Wejherowa i Warszawy. Jeżeli miasta nie ma wypisz zero.
    public static void main(String[] args) {

        Map<String,Integer> mapa = new HashMap<>();

        mapa.putIfAbsent("Gdańsk",123);
        mapa.putIfAbsent("Gdynia",100);
        mapa.putIfAbsent("Sopot",12);

        mapa.put("Gdynia",150);
        mapa.putIfAbsent("Wejherowo",36000);
        mapa.putIfAbsent("Gdańsk",100000);

        System.out.println(mapa);

        System.out.println("tylko miasta");
        System.out.println(mapa.keySet());

        System.out.println("--------");
        System.out.println(mapa.values());

        System.out.println("------------");
        System.out.println("dan dla ");
        System.out.println(mapa.getOrDefault("Gdańsk", 0));
        System.out.println(mapa.getOrDefault("Wjherowo", 0));
        System.out.println(mapa.getOrDefault("Warszawa", 0));

    }
}

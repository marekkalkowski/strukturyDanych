package pl.infoshare.structures._4_sets._1_comparing;

import pl.infoshare.structures._1_pojo.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class ComparingExample {

    public static void main(String[] args) {


        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Marek","Kalkowski",3));
        persons.add(new Person("Mikołaj","Kalkowski",6));
        persons.add(new Person("czesiek","Kalkowski",1));
        persons.sort(new PersonNameComparator());
        System.out.println(persons);

    }
}

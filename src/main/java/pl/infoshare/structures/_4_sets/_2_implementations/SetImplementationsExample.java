package pl.infoshare.structures._4_sets._2_implementations;

import pl.infoshare.structures._1_pojo.Person;

import java.util.HashSet;
import java.util.Set;

public class SetImplementationsExample {

    public static void main(String[] args) {

        Set<Person> people = new HashSet<>();

        people.add(new Person("marek","kalkowski",3));
        people.add(new Person("dawid","kalkowski",3));
        people.add(new Person("radek","kalkowski",3));
        people.add(new Person("monika","kalkowski",3));

        for (Person p: people
             ) {
            System.out.println(p);

        }

    }


}

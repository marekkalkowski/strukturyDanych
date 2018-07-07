package pl.infoshare.structures._2_lists._1_array;

import pl.infoshare.structures._1_pojo.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Lista {



    public static void main(String[] args) {

    Person firstPerson = new Person("Marek","Kalkowski",34);
    Person secondPerson = new Person("Dawid","Kalkowski",34);
    Person thirdPerson = new Person("Dorota","Kalkowski",34);

    ArrayWraper arrayWraper = new ArrayWraper();
    arrayWraper.add(firstPerson);
    arrayWraper.add(secondPerson);
    arrayWraper.add(thirdPerson);
        System.out.println(arrayWraper);
        System.out.println("----------");

        System.out.println(arrayWraper.get(1));
        System.out.println(arrayWraper.isEmpty());
        System.out.println(arrayWraper.size());
        System.out.println(arrayWraper);
        arrayWraper.remove(new Person("Marek","Kalkowski",34));
        System.out.println("------------");
        System.out.println(arrayWraper);

        for (Person p: arrayWraper
             ) {
            System.out.println(p);

        }


    }


}

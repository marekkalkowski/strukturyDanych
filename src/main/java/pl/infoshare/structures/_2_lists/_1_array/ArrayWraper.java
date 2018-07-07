package pl.infoshare.structures._2_lists._1_array;

import pl.infoshare.structures._1_pojo.Person;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayWraper implements Iterable<Person>{


    private Person[] people = new Person[0];

    public void add (Person person){
        people = increaseSize(people);
        people[people.length - 1] = person;

    }


    public Person get (int index){
        return people[index];
    }

    public boolean isEmpty (){
        return people.length == 0;
    }

    public void remove (Person person){
        for (int i = 0; i < people.length ; i++) {
            if (people[i].equals(person)){
                remove(i);
            }

        }


    }

    public int size () {return people.length;}

    public void remove (int index) {
        people[index] = null;
        people = getRidOfNulls(people);
    }

    private Person[] getRidOfNulls (Person[] people){
        Person[] arraywithOutNulls = new Person[people.length - 1];
        int currentIndex = 0;
        for (int i = 0; i <people.length ; i++) {
            if (people[i] != null){
                arraywithOutNulls[currentIndex] = people[i];
                currentIndex++;

            }

        }

        return arraywithOutNulls;
    }

    @Override
    public String toString() {
        return "ArrayWraper{" +
                "people=" + Arrays.toString(people) +
                '}';
    }

    private  Person[] increaseSize (Person[] array){
        Person[] increaseArray = new Person[array.length + 1];
        for (int i = 0; i <array.length;i++) {
            increaseArray[i] = array[i];

        }
            return  increaseArray;
    }


    @Override
    public Iterator<Person> iterator() {
        return null;
    }

    class PersonIterator implements Iterator<Person>{

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {

            return currentIndex < people.length;
        }

        @Override
        public Person next() {
            Person person = people[currentIndex];
            currentIndex++;
            return person;
        }
    }
}

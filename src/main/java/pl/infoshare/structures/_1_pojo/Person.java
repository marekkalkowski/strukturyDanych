package pl.infoshare.structures._1_pojo;

import java.util.Date;
import java.util.Objects;

public class Person implements Comparable<Person>{

   private String name;
    private String surName;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }

    public Person (String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;

    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(surName, person.surName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surName, age);
    }

    @Override
    public int compareTo(Person o) {
        if (this.age == o.age){
            if (this.surName.compareTo(o.surName) == 0 ) {
                return this.name.compareTo(o.name);
            }
            return this.surName.compareTo(o.surName);
        }
        if (this.age > o.age) { return 1;}
        if (this.age < o.age) {return -1;}

        return 0;
    }

}

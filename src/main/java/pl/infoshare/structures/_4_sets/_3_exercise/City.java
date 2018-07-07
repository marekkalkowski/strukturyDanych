package pl.infoshare.structures._4_sets._3_exercise;

import java.util.Objects;

public class City implements Comparable<
        City>{

    String name;
    int populacja;

    public City(String name, int populacja) {
        this.name = name;
        this.populacja = populacja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return populacja == city.populacja &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, populacja);
    }


    @Override
    public int compareTo(City otherCity'') {
        if (this.populacja == otherCity''.populacja) {
            return this.name.compareTo(otherCity''.name);
            }

        if (this.populacja > otherCity''.populacja) {return 1;}
        if (this.populacja < otherCity''.populacja) {return -1;}
        return 0;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", populacja=" + populacja +
                '}';
    }
}

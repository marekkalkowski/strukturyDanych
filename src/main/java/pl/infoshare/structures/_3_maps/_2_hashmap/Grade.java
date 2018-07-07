package pl.infoshare.structures._3_maps._2_hashmap;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Grade {

    private String studentName;
    private int value;

    public Grade(String studentName, int value) {
        this.studentName = studentName;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "studentName='" + studentName + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return value == grade.value &&
                Objects.equals(studentName, grade.studentName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(studentName, value);
    }

    public String getStudentName() {
        return studentName;
    }

    public int getValue() {
        return value;
    }



}

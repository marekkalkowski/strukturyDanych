package pl.infoshare.structures._3_maps._2_hashmap;

import javax.print.attribute.IntegerSyntax;
import java.util.*;


public class MapsExample {
    public static void main(String[] args) {

        //Map<String,Integer> grades = new HashMap<>();

        List<Grade> grades = getGrades();

        Map<String,List<Integer>> gradesMap = new HashMap<>();

        for (Grade grade : grades){
            gradesMap.putIfAbsent(grade.getStudentName(), new ArrayList<>());
            List<Integer> integers = gradesMap.get((grade.getStudentName()));
            integers.add(grade.getValue());
            gradesMap.put(grade.getStudentName(),integers);

        }

        System.out.println(gradesMap);
        System.out.println(countAverage(gradesMap.get("Maciek")));


    }

    private static double countAverage(List<Integer> integers){
        int z = 0;
        for (Integer i : integers
             ) {
            z +=i;


        }
        double avarage = (double)z/ integers.size();
       return avarage;


    }

    private static List<Grade> getGrades() {
        return Arrays.asList(

                new Grade("Marek",4),
        new Grade("Maciek",1),
        new Grade("Maciek",2),
        new Grade("Marek",7),
        new Grade("Marek",9)
            );
    }
}

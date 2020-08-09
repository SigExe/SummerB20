package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class gradeReport {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(66,66,62,65,81,82,100,90,85,75,55,45,73,73,35,
                47,60,87,77,67,57,47,93,83,73,63,43));
        System.out.println(list);

        ArrayList<Integer> gradeA = new ArrayList<>();
        gradeA.addAll(list);
        gradeA.removeIf(each -> each < 90);
        System.out.println("Grade A: " + gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>();
        gradeB.addAll(list);
        gradeB.removeIf(each -> each > 89 || each < 80);
        System.out.println("Grade B: " + gradeB);

        ArrayList<Integer> gradeC = new ArrayList<>();
        gradeC.addAll(list);
        gradeC.removeIf(each -> each > 79 || each < 70);
        System.out.println("Grade C: " + gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf(each -> each > 69 || each < 60);
        System.out.println("Grade D: " + gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeIf(each -> each > 59);
        System.out.println("Grade F: "+ gradeF);

        System.out.println("============================");
        System.out.println(gradeA.size() + " students made 'A'");
        System.out.println(gradeB.size() + " students made 'B'");
        System.out.println(gradeC.size() + " students made 'C'");
        System.out.println(gradeD.size() + " students made 'D'");
        System.out.println(gradeF.size() + " students failed :(");
    }
}

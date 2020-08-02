package day26_MultiDimensionalArray;

/*
write a program that can return the number of appearances
of “java” and “python” anywhere in the sentence
            ex:
                input: I love Java, Python is cool
                output: 1 Java 1 Python
                input: Java Java Python Python Python
                output: 2 Java 3 Python

 */

import java.util.Arrays;

public class java_Python {

    public static void main(String[] args) {

        String sentence = "Java Java Python Python Python java java python python python";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        int countJ = 0;
        int countP = 0;

        for(String each : words){
            if(each.toLowerCase().contains("java")){
                countJ ++;
            } else if(each.toLowerCase().contains("python")){
                countP++;
            }
        }

        System.out.println(countJ);
        System.out.println(countP);

    }



}

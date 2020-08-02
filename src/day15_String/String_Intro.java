package day15_String;

public class String_Intro {

    public static void main(String[] args) {
        String str = "Cybertek";

        String name = "Cybertek"; // String Literal
        String name2 = new String("Cybertek");

        String s1 = "Cat"; // String literal
        String s2 = "Cat"; // String literal

        System.out.println(s1 == s2);

        String d1 = "Dog"; // Stored in String pool
        String d2 = "dog"; // Stored in String pool

        System.out.println(d1 == d2);

        String t1 = new String("Tiger"); // Stored in heap
        String t2 = new String("Tiger"); // Stored in heap

        System.out.println(t1 == t2);

        String c1 = "Cybertek"; // Stored in pool
        String c2 = new String("Cybertek"); // Stored in heap
        String c3 = new String("Cybertek"); // Stored in heap
        String c4 = "Cybertek"; // Stored in pool

        System.out.println(c2 == c3);
        System.out.println(c1 = c4);




    }



}

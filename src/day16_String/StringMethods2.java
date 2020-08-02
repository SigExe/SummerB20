package day16_String;

public class StringMethods2 {
    public static void main(String[] args) {
        // str.empty
        String name1 = "Cybertek";
        boolean b = name1.isEmpty();
        System.out.println(b);

        // str.equals()
        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1 + " : " + str2);
        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true

        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println(str3 == str4); // false
        System.out.println(str3.equals(str4)); // true

        String str5 = "Java";
        String str6 = "Java";
        System.out.println(str5 == str6); // true
        System.out.println(str5.equals(str6)); // true

        String str8 = "JAVA";
        String str9 = "java";
        System.out.println(str8.equals(str9)); // false
        System.out.println(str8.equalsIgnoreCase(str9)); // true

        // str.equalsIgnoreCase
        // Literally the same thing except ignores the casing

        // contains:

        String str = "I like to learn Java programming language";
        System.out.println(str.contains("python"));
        System.out.println(!str.contains("python"));
        System.out.println(str.contains("java"));
        System.out.println(str.contains("JAVA"));

        // startsWith():
        String s1 = "Sergio";
        System.out.println(s1.startsWith("S")); // true
        System.out.println(s1.startsWith("J")); // false
        System.out.println(s1.startsWith("Se")); // true




    }


}

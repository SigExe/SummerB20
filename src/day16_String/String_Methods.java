package day16_String;

public class String_Methods {
    public static void main(String[] args) {
        String email = "cybertek@gmail.com";
        email = email.replace("gmail", "yahoo");
        System.out.println(email);

        String word = "Java";
        String word2 = word.replace("a", "e");
        System.out.println(word2);

        String sentence = "I like to learn Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java","a, C#");
        sentence = sentence.replace("Java ","Python ");
        System.out.println(sentence);

        String s1 = "I like to stay in Cybertek, Cybertek is a nice place";
        s1 = s1.replace("Cybertek", "MIT");
        System.out.println(s1);
        s1 = s1.replace("MIT","Cybertek");
        System.out.println(s1);

        String s2 = "I like to leaRn Java";
        s2 = s2.replace('R','r');
        System.out.println(s2);

        // replaceFirst

        String s3 = "I like to drink tea and tea";
        s3 = s3.replaceFirst("tea", "Cola");
        System.out.println(s3);

        String s4 = "I like to watch Games of Thrones, and Walking Dead";
        s4 = s4.replace(", and Walking Dead", "");
        System.out.println(s4);

        // indexOf()

        String s5 = "I like to stay in Cybertek, we are learning Java";
        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re");
        int r3 = s5.indexOf("rn");

        System.out.println(r1);
        System.out.println(s5.charAt(r1));
        System.out.println(r2);
        System.out.println(r3);

        // lastIndexOf()

        String s6 = "Java is a programming language, and Java is fun";
        int i6 = s6.indexOf(" J");
        i6 = s6.lastIndexOf("J");

        System.out.println(i6);
        System.out.println(i6);

        String s7 = "Java";
        int a1 = s7.indexOf("A");
        System.out.println(a1);

        String s8 = "Java";
        int a = s8.indexOf("a");
        char ch = s8.charAt(a);
        System.out.println(a);

    }



}

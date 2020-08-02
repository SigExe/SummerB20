package day15_String;

public class substring_method {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        //                 012345678910
        String sub = sentence.substring(0,4); // "Java "
        System.out.println(sub);

        String word2 = sentence.substring(8,11);
        System.out.println(word2);

        String sentence2 = "I like movies and TV series";
        String word3 = sentence2.substring(7,13);
        System.out.println(word3);

        String firstName = "sErgiO";
        String firstCharacter = firstName.substring(0,1);
        String rest = firstName.substring(1, firstName.length());

        firstName = firstCharacter.toUpperCase() + rest.toLowerCase();
        System.out.println(firstName);

        String lastName = "school";
        String firstChar = lastName.substring(0,1);
        String remain = lastName.substring(1);
        System.out.println(firstChar + remain);

        String up = firstChar.toUpperCase() + remain.toLowerCase();
        System.out.println(up);

        String s = "I like Game of Thrones";
        String series = s.substring(7);
        System.out.println(series);

        String s2 = "I like Java Programming Language";
        String language = s2.substring(7);
        System.out.println(language);


    }



}

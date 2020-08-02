package day29_CustomMethod;

public class PalindromeTest {

    public static void main(String[] args) {

        pali("redivider");
    }

    public static void pali(String word){

        String reverse = "";

        for(int i = word.length() - 1; i >= 0; i--){
            reverse += word.charAt(i);
        }

        System.out.println(reverse.equalsIgnoreCase(word));
    }



}

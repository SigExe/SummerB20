package day37_ArrayList;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Digits_Letters {

    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a', 'b', 'c', '3', '4', '5', '6',
                '&', '%', '@', '#', '*'));
        chars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(chars);

        System.out.println("======================================");

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('a', 'b', 'c', '3', '4', '5', '6',
                '&', '%', '@', '#', '*'));

        ArrayList<Character> digits = new ArrayList<>(); // [3,4,5,6]

        digits.addAll(list);
        digits.removeIf(p -> !Character.isDigit(p));
        System.out.println("Digits are: " + digits);

        ArrayList<Character> letters = new ArrayList<>(); // [a,b,c]

        letters.addAll(list);
        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println("Letters are: " + letters);

        ArrayList<Character> special = new ArrayList<>(); // [&,%,@,#,*]

        special.addAll(list);
        special.removeIf(p -> Character.isLetter(p) || Character.isDigit(p));
        System.out.println("Special characters are: " + special);


    }
}

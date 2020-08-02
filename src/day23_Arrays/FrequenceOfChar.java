package day23_Arrays;

/*
write a program that can return the frequency of every single characters from the string:
            ex:
                str1 = "aabbccaa";
                output: a4b2c2
                HINT:
                    easier approach:
                            1. remove duplicates ==> str2 = "abc"
 */

public class FrequenceOfChar {

    public static void main(String[] args) {
        String str = "ABAB";
        String nonDup = "";
        String result = "";

        for(int i = 0; i <= str.length() - 1; i++){
           String ch = "" + str.charAt(i);
            if(!nonDup.contains(ch)){
                nonDup += ch;
            }
        }

        System.out.println(nonDup);

        for(int j = 0; j <= nonDup.length() - 1; j++){

            char ch = nonDup.charAt(0);
            int count = 0;

            for(int i = 0; i <= str.length() - 1; i++){
                if(str.charAt(i) == ch){
                    count += 1;
        }

            }
            result += "" + ch + count;
        }


        System.out.println(result);





    }


}

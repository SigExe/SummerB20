package day31_Recap;

import Library.Util;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AABBBCCC";

        String expectedResult = "";

        String nonDup = Util.removeDup(str); // ABC

         for(char each : nonDup.toCharArray()){
            int count = Util.freq(str, each);
            expectedResult += "" + each + count;
        }

      /*  for(int i = 0; i <= nonDup.length() - 1; i++){
            char ch1 = nonDup.charAt(i);
            int count1 = Util.freq(str, ch1);
            expectedResult += "" + ch1 + count1;
        } */

       /* char ch1 = nonDup.charAt(0);
        int count1 = Util.freq(str, ch1); // 2
        expectedResult += "" + ch1 + count1;

        char ch2 = nonDup.charAt(1); // B
        int count2 = Util.freq(str, ch2); // 3
        expectedResult += "" + ch2 + count2;

        char ch3 = nonDup.charAt(2);
        int count3 = Util.freq(str, ch3);
        expectedResult += "" + ch3 + count3; */

        System.out.println(expectedResult);

        System.out.println("============================");

        String str2 = "wweeeeeeeeeerrrrrrrrrrrrrrrrrrrrrtttttttttyyyyyyyyuuuuu";
        String expectedResult2 = freqChar(str2);
        System.out.println(expectedResult2);

    }

    public static String freqChar(String str){

        String expectedResult = "";

        String nonDup = Util.removeDup(str); // ABC

        for(char each : nonDup.toCharArray()){
            int count = Util.freq(str, each);
            expectedResult += "" + each + count;
        }

        return expectedResult;
    }

}

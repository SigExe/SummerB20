package day23_Arrays;

public class FrequencyOfChar2 {
    public static void main(String[] args) {
        String str = "BBCCDD";
        String nonDup = "";

        for(int i =0; i <= str.length() - 1; i++){
            String ch = "" + str.charAt(i);

            if(nonDup.contains(ch)){
                continue;
            }else{
                nonDup += ch;
            }
        }

        String expectedResult = "";

        for(int j = 0; j <= nonDup.length() - 1; j++){
            char ch = nonDup.charAt(j); // B
            int count = 0;
            for(int i = 0; i <= str.length() -1; i++){
                if(str.charAt(i) == ch){
                    count += 1;
                }
            }

            expectedResult += "" + ch + count;
        }

        System.out.println(expectedResult);




    }



}

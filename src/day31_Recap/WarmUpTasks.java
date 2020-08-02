package day31_Recap;

/*
 1.  write a return method called frequency that accepts two parameters: string str
 and char ch, the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop
            please copy paste the method to the util class

 */

public class WarmUpTasks {

    public static void main(String[] args) {
        String str = "Aaaabccccdefffffffjkkkkkkl";

       String uniq1 = uniq(str);
        System.out.println(uniq1);
        System.out.println("=======================");
        String str2 = "pppppppoiiiuuuuuuuyttttttr";
        String uniq2 = uniq(str2);
        System.out.println(uniq2);
    }

    public static int freq(String str, char ch){
        int count = 0;
        for(char each: str.toCharArray()){
            if(each == ch){
                count++;
            }
        }

        return count;

    }

    public static String uniq(String str){
        String uniques = "";

        for( char each: str.toCharArray()){
            int freq = freq(str,each);
            if(freq == 1){
                uniques += each;
            }
        }
        return uniques;
    }

}

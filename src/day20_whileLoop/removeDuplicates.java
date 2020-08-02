package day20_whileLoop;

public class removeDuplicates {

    public static void main(String[] args) {
       String str = "aabb"; // "ab"
       //            0123
       String result = "";

       for(int i =0; i <= str.length() - 1; i++ ){
           String s = "" + str.charAt(i); // a, a, b, b
           if(!result.contains(s)){
               result += s;
           }
       }



    }


}

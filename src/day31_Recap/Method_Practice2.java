package day31_Recap;

public class Method_Practice2 {

    public static void main(String[] args) {
        String name = "madam";
        reverse1(name);
        // System.out.println(name.equalsIgnoreCase(reverse1(name);));
        String rev = reverse2(name);
        System.out.println(name.equalsIgnoreCase(reverse2(name)));
        System.out.println(name.equalsIgnoreCase(rev));



    }

    public static void reverse1(String str){
        String expectRes = "";

        for(int i = str.length() -1; i >= 0; i--){
            expectRes += str.charAt(i);
        }

        System.out.println(expectRes);
    }

    public static String reverse2(String str){
        String expectRes = "";

        for(int i = str.length() -1; i >= 0; i--){
            expectRes += str.charAt(i);
        }

        return expectRes;
    }
}

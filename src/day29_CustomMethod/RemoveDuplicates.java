package day29_CustomMethod;

public class RemoveDuplicates {

    public static void main(String[] args) {

        removeDup("aaaaabbbbbbbbbbccccdeeeeeeeeeeeffffggghhhjjjjjjjk");
    }

    public static void removeDup(String str){
        String nonDup = "";

        for( String each: str.split("")){
            if(!nonDup.contains(each)){
                nonDup += each;
            }
        }

        System.out.println(nonDup);
    }


}

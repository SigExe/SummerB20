package day25_Practices;

public class shortestString2 {

    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Tony", "Adam", "Alan", "Musa"};

        int minLength = arr[0].length();

        for( String each : arr){
            int l = each.length(); // 4  8  4  8

            if(l < minLength){
                minLength = l;
            }
        }

        for(String each : arr){
            if(each.length() == minLength){
                System.out.println(each);
            }
        }

        System.out.println(minLength);



    }


}

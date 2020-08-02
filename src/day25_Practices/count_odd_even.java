package day25_Practices;

public class count_odd_even {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int countE = 0;
        int countO = 0;

        String even = "";
        String odd = "";

        for (int each : nums) {
            if (each % 2 == 0) {
                countE += 1;
                even += each + " ";
            } else {
                countO++;
                odd += each + " ";
            }

        }

        /*
           if(each %2 ==0){
               countEven += 1;
               even += each+" ";
               continue;
           }
           countOdd++;
           odd += each+" ";
 */




        System.out.println("Even numbers count: " + even);
        System.out.println(countE);
        System.out.println("Odd numbers count: " + odd);
        System.out.println(countO);

    }

}



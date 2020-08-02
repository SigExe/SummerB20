package day24_Arrays;

public class average {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;

        for(int i = arr.length - 1; i >= 0; i--){
            sum += arr[i];
        }

        System.out.println("Sum is: " + sum);

        double average = sum / (double)arr.length;
        System.out.println("Average number is: " + average);



    }


}

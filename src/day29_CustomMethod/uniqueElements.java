package day29_CustomMethod;

public class uniqueElements {

    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C"};

        uniq(arr);

        System.out.println("Padema");

        String[] arr2 = {"D", "D", "E", "F", "F"};

        uniq(arr2);


    }

    public static void uniq(String[] arr) {

        for (String a : arr) {
            int count = 0;

            for (String each : arr) {
                if (a.equals(each)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(a + " ");
            }
        }

        System.out.println();

    }

}

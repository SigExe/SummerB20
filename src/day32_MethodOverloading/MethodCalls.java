package day32_MethodOverloading;

import Library.Util;

import java.util.Arrays;

public class MethodCalls {

    public static void main(String[] args) {

        String firstName = "elKEm";
        String lastName = "emET";

        String fullName = Util.formatFullName(firstName, lastName);
        System.out.println(fullName);

        String uniques = Util.uniq(fullName.toLowerCase());
        System.out.println(uniques);

        String rev = Util.reverse(fullName);
        System.out.println(rev);

        System.out.println("=================================");
        int[] a = {200, 400, 500, 200, 1000, 50, 40, 30, 400, 60, 78};
        int n = 2500;
        a = Util.addEle(a, n);
        System.out.println(Arrays.toString(a));

    }


}

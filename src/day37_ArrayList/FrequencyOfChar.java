package day37_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = "AAABBCC";
        ArrayList<String> list = new ArrayList<>();

        for(String each : str.split("")){
            list.add(each);
        }

        String nonDup = Util.removeDup(str);

        for(String each : nonDup.split("")){
            int count = Collections.frequency(list, each);
            System.out.print(each + count);
        }

    }
}

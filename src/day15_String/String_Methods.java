package day15_String;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Cybertek School is a great place";
        //             01234567

        // charAt(index):
        char ch1 = name.charAt(0); // 'C'
        char ch2 = name.charAt(5); // 't'
        System.out.println(ch1);
        System.out.println(ch2);

        // length() == int
        int l = name.length();
        System.out.println(l);

        int lastIndexNumber = name.length() - 1;
        System.out.println(lastIndexNumber);

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        // concat(Str):
        String schoolName = "Cybertek";
        schoolName = schoolName.concat(" School");
        System.out.println(schoolName);

        // toLowerCase():
        String name1 = "CYBERTEK SCHOOL";
        String name2 = name1.toLowerCase(); // cybertek school
        System.out.println(name2);

        // toUpperCase():
        String name3 = "cybertek school";
        String name4 = name3.toUpperCase(); // CYBERTEK SCHOOL
        System.out.println(name4);

        // trim():
        String p = "       Cybertek School          ";
        String p2 = p.trim(); // "Cybertek School"
        System.out.println(p2);



    }




}

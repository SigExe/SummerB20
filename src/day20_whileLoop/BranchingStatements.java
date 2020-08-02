package day20_whileLoop;

public class BranchingStatements {

    public static void main(String[] args) {

        char ch = 'A';
        while(ch <= 'E'){
            if(ch == 'C'){
                ch++;
                continue;
            }
            System.out.print(ch + " ");
            ch++;
        }

        System.out.println();

        /* char ch = 'A';
        while(ch <= 'E'){
            if(ch == 'C'){
                ch++;
                break;
            }
            System.out.print(ch + " ");
            ch++;
        } */

        /* if(true){
            System.exit(0);
        }

        System.out.println("Done"); */

        boolean a = true;
        while(a){
            System.out.println("Test started");
            //break;
            System.exit(0);
        }

        System.out.println("Completed");



    }



}

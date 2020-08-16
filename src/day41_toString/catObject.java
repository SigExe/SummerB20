package day41_toString;

import java.util.ArrayList;

public class catObject {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setInfo("Bobo", 7, 'M', "Orange", "Tiger");
        System.out.println(cat1);

        System.out.println("============================");

        Cat[] catPark = {cat1, new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};

        catPark[1].setInfo("DeWayne", 4, 'F', "Grafetti", "Gang");
        catPark[2].setInfo("DeLante", 2, 'M', "Gold", "Black");
        catPark[3].setInfo("Asha", 8, 'F', "Purple", "Greek");
        catPark[4].setInfo("Isis", 6, 'F', "Green", "Egypt");
        catPark[5].setInfo("Ullr", 3, 'M', "Boba", "Norse");


        for(Cat each: catPark){
            System.out.println(each);
        }

        System.out.println("=============================");

        ArrayList<Cat> females = new ArrayList<>();
        ArrayList<Cat> males = new ArrayList<>();

        for (int i = 0; i <= catPark.length - 1; i++){

            if(catPark[i].gender == 'M'){
                males.add(catPark[i]);
            }else{
                females.add(catPark[i]);
            }
        }

        System.out.println(females);
        System.out.println(males);

    }
}

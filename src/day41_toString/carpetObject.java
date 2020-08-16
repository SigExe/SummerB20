package day41_toString;

/*
1. create a custom class for the Carpet class that should contain the following:

                instance variables:
                        width, length, unitPrice, isPersian (boolean)
                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        getCarpetInfo(): should be able to display all the info of the carpet
                        including the total cost of the carpet as calculated by calcCost()
            total price of carpet= (width*length)*unitprice
            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
            create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects
            ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets,
            and store all regular carpets into the list of reugularCarpets
                    use for each loop to print out all the persian carpets

 */

import java.util.ArrayList;

public class carpetObject {

    public static void main(String[] args) {
        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(4.5, 3.5, 7.5, false);
        carpets[1].customOrder(5.5, 3.5, 8.5, true);
        carpets[2].customOrder(4.5, 5.5, 9.5, false);
        carpets[3].customOrder(3.5, 4.5, 10.5, true);
        carpets[4].customOrder(6.5, 5.5, 11.5, true);

       /* for(Carpet each : carpets){
            each.getCarpetInfo();
        } */

        ArrayList<Carpet> persian = new ArrayList<>();
        ArrayList<Carpet> regular = new ArrayList<>();

       /* for(int i = 0; i <= carpets.length - 1; i++){
            if(carpets[i].isPersian){
                persian.add(carpets[i]);
            } else{
                regular.add(carpets[i]);
            }
        } */

        for(Carpet each : carpets){
            if(each.isPersian){
                persian.add(each);
            } else{
                regular.add(each);
            }
        }

        System.out.println("Number of Persian carpets: " + persian.size());
        System.out.println("Number of Regular carpets: " + regular.size());



    }
}

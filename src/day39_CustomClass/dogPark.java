package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class dogPark {

    public static void main(String[] args) {

        Dog[] dogPark = { new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};

        dogPark[0].setDogInfo("Luka", "Slovenian Husky", "Big", 3, "Champion");
        dogPark[1].setDogInfo("Moha", "Jihad Terrier", "Small", 5, "Muslim");
        dogPark[2].setDogInfo("Coco", "Fruit", "Small", 5, "Fuzzy");
        dogPark[3].setDogInfo("Jako", "Croatian Bulldog", "Big", 4, "Cosmic");
        dogPark[4].setDogInfo("Peter", "Labrador", "Big", 7, "Yellow");

        for(int i = 0; i <= dogPark.length - 1; i++){
            dogPark[i].getDogInfo();
        }

        System.out.println("========================");

        for( Dog eachDog: dogPark){
            eachDog.getDogInfo();
        }

        System.out.println("=========================");
        String food = "Treats";

        for(Dog eachDog: dogPark){
            eachDog.eat(food);
        }

        System.out.println("==========================");
        String drink = "milk";

        for(Dog eachDog: dogPark){
            eachDog.drink(drink);
        }

        System.out.println("===========================");
        // play

        for(Dog eachDog: dogPark){
            eachDog.play();
        }

        System.out.println("===========================");
        // sleep

        for(Dog eachDog: dogPark){
            eachDog.sleep("now");
        }

    }
}

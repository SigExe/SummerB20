package day39_CustomClass;

import javax.print.DocFlavor;

public class Dog {

    /*
    instance variables:
        breed, size, age, color

    instance methods:
        setDogInfo, getDogInfo, etc...
     */

    String breed;
    String size;
    int age;
    String color;
    String name;

    public void setDogInfo(String dogName, String dogBreed, String dogSize, int dogAge, String dogColor){
        breed = dogBreed;
        size = dogSize;
        age = dogAge;
        color = dogColor;
        name = dogName;
    }

    // sets the info of the dog

    public void getDogInfo(){
        System.out.println("Name: " +name + ", Breed: " +breed + ", Age: " +age + ", Size: " +size + ", Color: " +color);
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String beverage){
        System.out.println(name + " is drinking " + beverage);
    }

    public void sleep(String bed){
        System.out.println(name + " is sleeping on a " + bed);
    }

    public void play(){
        System.out.println(name + " is playing, wow");
    }

    /*
    dog 1: Husky
    dog 2: Pitbull
    dog 3: Golden
     */
}

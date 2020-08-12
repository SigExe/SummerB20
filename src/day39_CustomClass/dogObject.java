package day39_CustomClass;

public class dogObject {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("Rubinho", "Husky", "Big", 4, "Grey/White");

        /* System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.color); */

        dog1.getDogInfo();

        System.out.println("========================");

        dog2.setDogInfo("Kappa", "Pitbull", "Really Big", 7, "Death");
        dog2.getDogInfo();

        System.out.println("========================");

        dog3.setDogInfo("Ragnar", "Golden Retriever", "Medium", 6, "Adventure");
        dog3.getDogInfo();

        System.out.println("=========================");

        dog1.eat("Vegan Steak");
        dog2.eat("Ass");
        dog3.eat("Shrooms");

        System.out.println("==========================");

        dog1.drink("Almond Milk");
        dog2.drink("Blood");
        dog3.drink("Space Wine");

        System.out.println("===========================");

        dog1.sleep("pillow");
        dog2.sleep("corpse");
        dog3.sleep("asteroid");

    }
}

package org.lessons.java;

public class Main {
    public static void makeSwim(CanSwim animal){
        animal.swim();
    }

    public static void makeFly(CanFly animal){
        animal.fly();
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dolphin dolphin = new Dolphin();
        Eagle eagle = new Eagle();
        Sparrow sparrow = new Sparrow();
        Animal[] animals = {dog, dolphin, sparrow, eagle};

        for(Animal animal : animals){
            System.out.println(animal.getClass().getSimpleName() + ": ");
            animal.sleep();
            animal.sound();
            animal.eat();
        }

        makeFly(eagle);
        makeFly(sparrow);
        makeSwim(dolphin);
        makeSwim(dog);

        /* Test "instance of" without methods
        for(Animal animal : animals){
                System.out.print(animal.getClass().getSimpleName() + ": ");
            if (animal instanceof CanFly){
                ((CanFly) animal).fly();
            } else if (animal instanceof CanSwim){
                ((CanSwim) animal).swim();
            } else {
                System.out.println("I can't swim or fly");
            }
        }*/

    }
}

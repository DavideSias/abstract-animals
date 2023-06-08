package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dolphin dolphin = new Dolphin();
        Eagle eagle = new Eagle();
        Sparrow sparrow = new Sparrow();
        Animal[] animals = {dog, dolphin, sparrow, eagle};

        for(Animal animal : animals){
            animal.sleep();
            animal.sound();
            animal.eat();
        }
    }
}

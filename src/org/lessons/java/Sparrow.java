package org.lessons.java;

public class Sparrow extends Animal implements CanFly{
    @Override
    public void sound() {
        System.out.println("chip chip");
    }

    @Override
    public void eat() {
        System.out.println("cereals");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}

package org.lessons.java;

public class Eagle extends Animal implements CanFly{
    @Override
    public void sound() {
        System.out.println("eagle sound");
    }

    @Override
    public void eat() {
        System.out.println("meat");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}

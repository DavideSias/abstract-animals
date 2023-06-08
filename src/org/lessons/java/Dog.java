package org.lessons.java;

public class Dog extends Animal implements CanSwim{
    @Override
    public void sound() {
        System.out.println("bark");
    }

    @Override
    public void eat() {
        System.out.println("meat");
    }
    @Override
    public void swim() {
        System.out.println("I'm swimming!!!");
    }
}

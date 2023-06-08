package org.lessons.java;

public class Dolphin extends Animal implements CanSwim{
    @Override
    public void sound() {
        System.out.println("dolphin sound");
    }

    @Override
    public void eat() {
        System.out.println("fish");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming!!!");
    }
}

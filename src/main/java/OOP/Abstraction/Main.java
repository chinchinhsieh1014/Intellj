package OOP.Abstraction;

import javax.annotation.processing.SupportedSourceVersion;

abstract class Animal {
    // abstract method
    public abstract void eat();

    // concrete method
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("dog eats meat");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}

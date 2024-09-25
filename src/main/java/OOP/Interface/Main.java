package OOP.Interface;

// interface 1
interface AnimalBehavior {
    void eat();
    void sleep();
}

// interface 2
interface Movable {
    void move();
}

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal implements AnimalBehavior, Movable {

    private String type;
    public Dog(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println("dog eats");
    }

    @Override
    public void sleep() {
        System.out.println("dog sleeps");
    }

    @Override
    public void move() {
        System.out.println("dog runs");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("A","Pug");
        dog.eat();
        dog.sleep();
        dog.move();
    }
}

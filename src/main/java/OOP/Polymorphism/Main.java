package OOP.Polymorphism;

// super class
class Animal {
    public void sound() {
        System.out.println("Animal makes sounds.");
    }
}

// subclass
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        System.out.println(animal.getClass().getName());

        Dog dog1 = new Dog();
        dog1.sound();
        System.out.println(dog1.getClass().getName());

        Animal dog2 = new Dog();
        dog2.sound();
        System.out.println(dog2.getClass().getName());

    }
}

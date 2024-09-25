package OOP.Inheritance;

// super class
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("animal eats");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animal {
    private String move;

    public Dog(String name, String move) {
        super(name);
        this.move = move;
    }

    public void bark() {
        System.out.println("dog barks");
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("dog", "run");
        dog.eat();
        dog.bark();
        System.out.println(dog.getName()+" "+dog.getMove());
    }
}

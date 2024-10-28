package note;

@FunctionalInterface
interface sayHello {
    void hello();
    default void defaultMethod() {
        System.out.println("This is a default method");
    }

    static void staticMethod() {
        System.out.println("This is a static method");
    }
}
public class functionalInterfaceExample {
    public static void main(String[] args) {
        sayHello LambdaExample = () -> System.out.println("hello");
        LambdaExample.hello();
        LambdaExample.defaultMethod();
    }
}

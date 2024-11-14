package Other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

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

@FunctionalInterface
interface Operation<T> {
    T operate(T v1, T v2);
}

public class functionalInterfaceExample {
    public static void main(String[] args) {
        // parameters and body
        List<String> lists = new ArrayList<>(List.of("Alpha", "Bravo", "Charlie", "Delta"));
        System.out.println("--- for ---");
        for(String list: lists) {
            System.out.println(list);
        }
        System.out.println("--- for each ---");
        lists.forEach((s) -> System.out.println(s));
        System.out.println("--- for each with body ---");
        lists.forEach((var s) -> {
            char first = s.charAt(0);
            System.out.println(first+": "+s);
        });

        // self-defined - no parameter
        System.out.println("--- Self defined functional interface ---");
        sayHello LambdaExample = () -> {System.out.println("hello");};
        LambdaExample.hello();
        LambdaExample.defaultMethod();

        // self-defined - 2 parameters
        int r = calculator( (a,b)-> a+b, 1,2);
        // without generic method
        Operation<Integer> add = (a, b) -> a+b;
        int result = add.operate(1, 2);
        System.out.println(result);

        // consumer
        System.out.println("--- Consumer ---");
        var coords = Arrays.asList(
                new double[]{47.215, 39.223},
                new double[]{12.345, 56.924},
                new double[]{99.223, 39.192});
        coords.forEach(s -> System.out.println(Arrays.toString(s)));
        // biconsumer
        BiConsumer<Double, Double> p1 = (lat, lng) -> System.out.printf("[lat:%.3f lng:%.3f]%n", lat, lng);
        var firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1);
        coords.forEach(s -> processPoint(s[0], s[1], p1));

        // predict
        System.out.println("--- Predict ---");
        lists.removeIf(s -> s.equalsIgnoreCase("Bravo"));
        lists.forEach(s -> System.out.println(s));
        System.out.println("---");
        lists.addAll(List.of("echo", "easy", "earnest"));
        lists.forEach(s -> System.out.println(s));
        System.out.println("---");
        lists.removeIf(s -> s.startsWith("e"));
        lists.forEach(s -> System.out.println(s));
        System.out.println("---");
        lists.replaceAll(s -> s.charAt(0) + "-" + s.toUpperCase());
        lists.forEach(s -> System.out.println(s));

        // array
        System.out.println("--- Array ---");
        String[] emptyStrings = new String[10];
        System.out.println(Arrays.toString(emptyStrings));
        Arrays.fill(emptyStrings, " ");
        System.out.println(Arrays.toString(emptyStrings));
        Arrays.setAll(emptyStrings, (i) ->""+(i+1)+".");
        System.out.println(Arrays.toString(emptyStrings));

        // Supplier
        System.out.println("--- Supplier ---");
        String[] name = {"A", "B", "C", "D", "E", "F"};
        Random random = new Random();
        String[] randomList = randomlySelectedValues(15, name, () -> random.nextInt(name.length));
        System.out.println(Arrays.toString(randomList));

        // comparator
        System.out.println("--- Comparator ---");
    }

    // generic method
    public static <T> T calculator(Operation<T> function, T value1, T value2) {
        T result = function.operate(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer) {
        consumer.accept(t1, t2);
    }

    public static String[] randomlySelectedValues(int count, String[] values, Supplier<Integer> s) {
        String[] selectedValues = new String[count];
        for (int i = 0; i < count; i++) {
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }

}

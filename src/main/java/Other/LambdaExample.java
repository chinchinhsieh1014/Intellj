package Other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    record Person (String firstName, String lastName) {
        @Override
        public String toString() {
            return firstName+" "+lastName;
        }
    }
    public static void main(String[] args) {
        List<Person> users = new ArrayList<>(Arrays.asList(
                new Person("A", "a"),
                new Person("B", "a"),
                new Person("C", "c"),
                new Person("D", "d")));

        System.out.println(users);
    }

}

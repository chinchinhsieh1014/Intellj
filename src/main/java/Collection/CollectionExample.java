package Collection;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // ArrayList Example
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Alice");
        arrayList.add("Bob");
        arrayList.add("Charlie");

        // LinkedList Example
        Deque<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        // HashSet Example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Duplicate, will not be added

        // TreeSet Example
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Dog");
        treeSet.add("Cat");
        treeSet.add("Elephant");

        // HashMap Example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Jack", 35);

        // Iterate over collections
        System.out.println("ArrayList:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        System.out.println("LinkedList:");
        for (String item : linkedList) {
            System.out.println(item);
        }

        System.out.println("HashSet:");
        for (String item : hashSet) {
            System.out.println(item);
        }

        System.out.println("TreeSet:");
        for (String item : treeSet) {
            System.out.println(item);
        }

        System.out.println("HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


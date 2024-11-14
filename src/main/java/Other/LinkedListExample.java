package Other;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<>();

        // add(index, value)
        placeToVisit.add("A");
        placeToVisit.add("B");
        placeToVisit.add("C");
        placeToVisit.add("D");
        System.out.println(placeToVisit);

        // --- Queue ---
        // offer
        // offerFirst
        // offerLast
        // element
        System.out.println(placeToVisit.element());

        // --- Stack ---
        // push
        // pop
        // peek
        // peekFirst
        // peekLast

        // remove(index)
        // remove(value)
        // remove -> remove the first element
        // removeFirst
        // removeLast

        // poll -> remove the first element
        // pollFirst
        // pollLast

        // retrieve the element
        String s = placeToVisit.get(1);
        System.out.printf("Got: %s %n", s);
        // getFirst
        // getLast
        // indexOf(value)
        // lastIndexOf(value)

        // for
        for (String string : placeToVisit) {
            System.out.println(string);
        }

        // iterator - only have remove
        var iterator = placeToVisit.iterator();
        while (iterator.hasNext()) {
            var town = iterator.next();
            if (town.equals("C")) {
                iterator.remove();
            }
        }
        System.out.println(placeToVisit);

        // listIterator
        var listiterator = placeToVisit.listIterator();
        // add
        // remove
        // previous

    }
}

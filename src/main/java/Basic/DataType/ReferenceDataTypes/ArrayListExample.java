package Basic.DataType.ReferenceDataTypes;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Declare
        ArrayList<Integer> numbers = new ArrayList<>();

        // add()
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // get(index)
        int get0 = numbers.get(0);

        // set(index, newValue)
        numbers.set(0,0);

        // remove
        // can be index or value
        numbers.remove(0);

        // size()
        int size = numbers.size();

        // for
        for(int i=0; i<numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        for(int num : numbers){
            System.out.println(num);
        }

        // contains()
        boolean hasOne = numbers.contains(1);

        // clear()
        numbers.clear();
    }
}

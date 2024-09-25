package Basic.DataType.ReferenceDataTypes;

public class ArrayExample {
    public static void main(String[] args) {
        // Declaration
        int[] number1;

        // Initialise
        int[] number2 = new int[5];
        String[] fruits = {"Apple", "Banana", "Cherry"};
        int[] number3 = new int[] {10, 20, 30, 40, 50};

        // length
        int len = number2.length;

        // for
        for(int i=0; i<number3.length; i++) {
            System.out.println("Element at index " + i + ": " + number3[i]);
        }
        for(int num: number3) {
            System.out.println(num);
        }

        // 2D
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }

    // Passing an Array to a Method
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    // Returning an Array from a Method
    public static int[] createArray() {
        return new int[] {10, 20, 30, 40, 50};
    }
}

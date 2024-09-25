package ArrayString;

public class Pointer {
    public static void main(String[] args) {

    }

    // the same array
    public static void twoPointer(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left<right) {
            // Do some logic here depending on the problem
            // Do some more logic here to decide on one of the following:
            //     1. left++
            //     2. right--
            //     3. Both left++ and right--
            left ++;
            right --;
        }
    }
    // different arrays
    public static void pointersTwoArray(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        while (i<arr1.length && j<arr2.length) {
            // Do some logic here depending on the problem
            // Do some more logic here to decide on one of the following:
            // 1. i++
            // 2. j++
            i++;
            j++;
            // make sure both iterables are exhausted
            while (i < arr1.length) {
                // Do some logic here depending on the problem
                i++;
            }
            while (j < arr2.length) {
                // Do some logic here depending on the problem
                j++;
            }
        }
    }

}

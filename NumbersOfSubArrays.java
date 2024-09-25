package org.example;

public class NumbersOfSubArrays {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int result = subarrayProductLessThanK(nums, k);
        System.out.printf("result: %d %n", result);
    }

    public static int subarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        int curr = 1;
        int left = 0;
        int right = 0;
        while (right<nums.length) {
            curr *= nums[right];
            while (curr>=k) {
                curr /= nums[left];
                left++;
            }
            ans += (right-left+1);
            right++;
        }
        return ans;
    }
}

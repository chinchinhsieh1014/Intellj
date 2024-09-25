package org.example;

public class FixedSizeWindow {
    public static void main(String[] args) {
        int[] nums = {3 , -1, 4, 12, -8, 5, 6};
        int k = 4;
        int result = maxSumInWindow(nums, k);
        System.out.printf("result: %d %n", result);

    }

    public static int maxSumInWindow(int[] nums, int k) {
        int curr = 0;
        // the first window
        for (int i=0; i<k; i++) {
            curr += nums[i];
        }
        int ans = curr;
        for (int i=k;i<nums.length;i++) {
            // slice the window
            curr = curr-nums[i-k]+nums[i];
            ans = Math.max(ans, curr);
        }
        return ans;
    }


}

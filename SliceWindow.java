package org.example;

public class SliceWindow {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        int k = 8;
        int result1 = longestSubarray(nums, k);
        System.out.printf("result: %d %n", result1);
        // result: 4
        String s = "1101100111";
        int result2 = longestOne(s);
        System.out.printf("result: %d %n", result2);
        // result: 5
    }

    public static int longestSubarray(int[] nums, int k) {
        int longestSubarray = 0;
        int left = 0;
        int right = 0;
        int curr = 0;
        while (right<nums.length) {
            curr += nums[right];
            // if invalid
            while (curr>k) {
                curr -= nums[left];
                left = left+1;
            }
            longestSubarray = Math.max(longestSubarray, right-left+1);
            right++;
        }
        return longestSubarray;
    }

    public static int longestOne(String s) {
        int ans = 0;
        int left = 0;
        int right = 0;
        int flip = -1;
        while(right<s.length()) {
            if (s.charAt(right)=='0') {
                if (flip==-1) {
                    // set the first flip
                    flip = right;
                }
                else {
                    // remove the pervious flip
                    left = flip+1;
                    // set the new flip
                    flip = right;
                }
            }
            ans = Math.max(ans, right-left+1);
            right++;
        }
        return ans;
    }
}

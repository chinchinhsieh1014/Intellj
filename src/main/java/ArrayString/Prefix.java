package org.example;

public class Prefix {
    public static void main(String[] args) {
        int[] nums = {1, 6, 3, 2, 7, 2};
        int[][] queries = {{0, 3}, {2, 5}, {2, 4}};
        int limit = 13;
        boolean[] result = isLessThanLimit(nums, queries, limit);
        for(int i=0; i<result.length; i++) {
            System.out.printf("result: %b %n", result[i]);
        }

    }
    public static int[] prefix(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            prefix[i] = nums[i]+prefix[i-1];
        }
        return prefix;
    }
    public static boolean[] isLessThanLimit(int[] nums, int[][] queries, int limit) {
        boolean[] ans = new boolean[queries.length];
        int[] prefixArray = prefix(nums);
        for (int i=0; i<queries.length; i++) {
            if ((prefixArray[queries[i][1]]-prefixArray[queries[i][0]]+nums[queries[i][0]])<limit) {
                ans[i] = true;
            } else {
                ans[i] = false;
            }
        }
        return ans;
    }

}

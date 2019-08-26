package com.practice.easy._001;

import java.util.Arrays;

/**
 * @ClassName: Solution
 * @Description: TODO
 * @Author: Tao
 * @Date 2019-08-26 22:10
 */
public class Solution {

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 18);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

}

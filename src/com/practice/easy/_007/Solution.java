package com.practice.easy._007;

/**
 * @ClassName: Solution
 * @Description: 007
 * @Author: Tao
 * @Date 2019-08-25 21:01
 */
public class Solution {

    public static int reverse(int x) {

        long res = 0;
        for (; x != 0; x /= 10) {
            res = res * 10 + x % 10;
        }

        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(100));
        System.out.println(reverse(1000000003));
    }

}

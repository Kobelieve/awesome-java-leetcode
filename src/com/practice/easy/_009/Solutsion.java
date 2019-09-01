package com.practice.easy._009;

/**
 * @ClassName: Solutsion
 * @Description: TODO
 * @Author: Tao
 * @Date 2019-08-31 08:09
 */
public class Solutsion {

    public static boolean isPalindromeNew(int num) {

        if (num < 0 || (num != 0 && num % 10 == 0)) {
            return false;
        }

        int halfReverseNum = 0;
        while (num > halfReverseNum) {
            halfReverseNum = halfReverseNum * 10 + num % 10;
            num /= 10;
        }

        return halfReverseNum == num || halfReverseNum / 10 == num;
    }

    public static boolean isPalindrome(int num) {

        if (num < 0) {
            return false;
        }

        int copyNum = num, reverse = 0;
        while (copyNum > 0) {
            reverse = reverse * 10 + copyNum % 10;
            copyNum /= 10;
        }

        return num == reverse;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindromeNew(1221));
    }

}

package PlusOne;

/*

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

        Increment the large integer by one and return the resulting array of digits.



        Example 1:

        Input: digits = [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123.
        Incrementing by one gives 123 + 1 = 124.
        Thus, the result should be [1,2,4].

        Example 2:

        Input: digits = [4,3,2,1]
        Output: [4,3,2,2]
        Explanation: The array represents the integer 4321.
        Incrementing by one gives 4321 + 1 = 4322.
        Thus, the result should be [4,3,2,2].

        Example 3:

        Input: digits = [9]
        Output: [1,0]
        Explanation: The array represents the integer 9.
        Incrementing by one gives 9 + 1 = 10.
        Thus, the result should be [1,0].



        Constraints:

        1 <= digits.length <= 100
        0 <= digits[i] <= 9
        digits does not contain any leading 0's.

*/

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{8, 9, 9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9, 8})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 8, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 8, 9, 9})));
    }
/*
    private static int plusOne_(int index) {
        System.out.println("_ before " + Arrays.toString(staticArray));

        staticArray[index]++;

        if (10 == staticArray[index]) {
            staticArray[index] = 0;
            System.out.println("_ after " + Arrays.toString(staticArray));
            return 1;
        }
        System.out.println("_ after " + Arrays.toString(staticArray));
        return 0;
    }*/

    private static boolean isAllNines(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (9 != digits[i]) return false;
        }
        return true;
    }

    private static int[] normalAdd(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (10 != digits[i]) {
                return digits;
            }
            digits[i] = 0;
        }
        return digits;
    }

    public static int[] plusOne(int[] digits) {

        if (isAllNines(digits)) {
            int[] ret = new int[digits.length + 1];
            ret[0] = 1;
            return ret;
        } else {
            return normalAdd(digits);
        }
    }
}
package AddBinary;


/*

                             https://leetcode.com/problems/add-binary/
    Given two binary strings a and b, return their sum as a binary string.



    Example 1:

    Input: a = "11", b = "1"
    Output: "100"

    Example 2:

    Input: a = "1010", b = "1011"
    Output: "10101"



    Constraints:

        1 <= a.length, b.length <= 104
        a and b consist only of '0' or '1' characters.
        Each string does not contain leading zeros except for the zero itself.



*/

class Solution {
    public static void main(String[] args) {
        System.out.println(addBinary("1", "11"));
        System.out.println(addBinary("1010", "1011"));
        System.out.println(addBinary("1111", "1111"));
    }

    public static String addBinary(String s, String s2) {
        return Integer.toBinaryString(toBinary(s) + toBinary(s2));
    }

    public static int toBinary(String c) {
        int sum = 0;
        if (c.contains("0") || c.contains("1")) {
            int exponent = 1;
            for (int i = c.length() - 1; i >= 0; i--) {
                var ch = c.charAt(i);
                if ('1' == ch) {
                    sum += exponent;
                } else if ('0' == ch) {
                    //meh
                } else {
                    System.out.println("Harry Kim was here");
                    return 0;
                }
                exponent *= 2;
            }
        }
        return sum;
    }
}
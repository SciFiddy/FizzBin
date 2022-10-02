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

import java.math.BigInteger;

class Solution {
    public static void main(String[] args) {
        System.out.println(toBinary("1"));
        System.out.println(toBinary("11"));
        System.out.println(toBinary("01"));
        System.out.println(toBinary("10101"));
        System.out.println(toBinary("1111"));
        System.out.println(addBinary("1", "11"));
        System.out.println(addBinary("1010", "1011"));
        System.out.println(addBinary("1111", "1111"));
        System.out.println(addBinary(
                "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
                , "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
        ));
    }

    public static String addBinary(String s, String s2) {
        return (toBinary(s).add(toBinary(s2))).toString(2);
    }

    public static BigInteger toBinary(String c) {
        BigInteger sum = new BigInteger("0");
        if (c.contains("0") || c.contains("1")) {
            BigInteger exponent = new BigInteger("1");
            for (int i = c.length() - 1; i >= 0; i--) {
                var ch = c.charAt(i);
                if ('1' == ch) {
                    sum=sum.add(exponent);
                } else if ('0' == ch) {
                    //meh
                } else {
                    System.out.println("Harry Kim was here");
                    return null;
                }
                exponent=exponent.multiply(BigInteger.TWO);
            }
        }
        return sum;
    }
}
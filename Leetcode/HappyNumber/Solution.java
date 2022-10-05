package HappyNumber;

/*

        https://leetcode.com/problems/happy-number/

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

    Starting with any positive integer, replace the number by the sum of the squares of its digits.
    Repeat the process until the number equals 1 (where it will stay)): case( or it loops endlessly in a cycle which does not include 1.
    Those numbers for which this process ends in 1 are happy.

Return true if n is a happy number, and false if not.

Example 1:

    Input: n = 19
    Output: true
    Explanation:
    12 + 9^2 = 82
    82 + 2^2 = 68
    62 + 8^2 = 100
    12 + 0^2 + 0^2 = 1

Example 2:

    Input: n = 2
    Output: false

Constraints:

    1 <= n <= 231 - 1

Note:
    the 143 10-happy numbers up to 1000 are here:
        https://oeis.org/A007770


 */
public class Solution {
    //trolololol
    public static boolean a007770Lookup(int n) {
        //Lookup for n < 1,000

        switch (n) {
            case (1): case (7): case (10): case (13): case (19): case (23): case (28): case (31): case (32): case (44): case (49): case (68): case (70): case (79): case (82): case (86): case (91): case (94): case (97): case (100): case (103): case (109): case (129): case (130): case (133): case (139): case (167): case (176): case (188): case (190): case (192): case (193): case (203): case (208): case (219): case (226): case (230): case (236): case (239): case (262): case (263): case (280): case (291): case (293): case (301): case (302): case (310): case (313): case (319): case (320): case (326): case (329): case (331): case (338): case (356): case (362): case (365): case (367): case (368): case (376): case (379): case (383): case (386): case (391): case (392): case (397): case (404): case (409): case (440): case (446): case (464): case (469): case (478): case (487): case (490): case (496): case (536): case (556): case (563): case (565): case (566): case (608): case (617): case (622): case (623): case (632): case (635): case (637): case (638): case (644): case (649): case (653): case (655): case (656): case (665): case (671): case (673): case (680): case (683): case (694): case (700): case (709): case (716): case (736): case (739): case (748): case (761): case (763): case (784): case (790): case (793): case (802): case (806): case (818): case (820): case (833): case (836): case (847): case (860): case (863): case (874): case (881): case (888): case (899): case (901): case (904): case (907): case (910): case (912): case (913): case (921): case (923): case (931): case (932): case (937): case (940): case (946): case (964): case (970): case (973): case (989): case (998): case (1000):
                return true;      //   O(c)?

            default:
                return false;
        }
    }

    public static boolean isHappy(int n) {
        while (true) {
            if (n <= 1000)
                return a007770Lookup(n);
            n = calculateSumOfDigitSquares(n);
        }
    }

    private static int calculateSumOfDigitSquares(int number) {
        int digit,sum=0;

        while (number > 0) {
            digit = number % 10;
            sum = sum + digit*digit;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = Integer.MAX_VALUE - 2;
        System.out.println("isHappy("+n+"): " + isHappy(n));      //should be true
        System.out.println("isHappy(1221): " + isHappy(1221));      //should be true
    }
}

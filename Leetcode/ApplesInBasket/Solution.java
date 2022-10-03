package ApplesInBasket;

/*

        https://leetcode.com/problems/how-many-apples-can-you-put-into-the-basket/

    You have some apples and a basket that can carry up to 5000 units of weight.

    Given an integer array weight where weight[i] is the weight of the ith apple, return the maximum number of apples you can put in the basket.



    Example 1:

    Input: weight = [100,200,150,1000]
    Output: 4
    Explanation: All 4 apples can be carried by the basket since their sum of weights is 1450.

    Example 2:

    Input: weight = [900,950,800,1000,700,800]
    Output: 5
    Explanation: The sum of weights of the 6 apples exceeds 5000 so we choose any 5 of them.



    Constraints:

        1 <= weight.length <= 103
        1 <= weight[i] <= 103



 */


import java.util.Arrays;

public class Solution {
    public static final int UNITS_OF_WEIGHT = 5000;

    public static void main(String[] args) {
        System.out.println(maxNumberOfApples(new int[]{100, 200, 150, 1000})); // should be 4
        System.out.println(maxNumberOfApples(new int[]{900, 950, 800, 1000, 700, 800})); // should be 5
    }

    public static int maxNumberOfApples(int[] weight) {
        Arrays.sort(weight);
        int count = 0;
        for (int sum = 0, i = 0; i < weight.length; i++, count = i) {
            sum += weight[i];
            if (sum > UNITS_OF_WEIGHT) {
                break;
            }
        }
        return count;
    }
}

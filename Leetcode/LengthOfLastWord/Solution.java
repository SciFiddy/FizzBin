package LengthOfLastWord;
/*

https://leetcode.com/problems/length-of-last-word/

    Given a string s consisting of words and spaces, return the length of the last word in the string.

    A word is a maximal substring consisting of non-space characters only.

    Example 1:

    Input: s = "Hello World"
    Output: 5
    Explanation: The last word is "World" with length 5.

    Example 2:

    Input: s = "   fly me   to   the moon  "
    Output: 4
    Explanation: The last word is "moon" with length 4.

    Example 3:

    Input: s = "luffy is still joyboy"
    Output: 6
    Explanation: The last word is "joyboy" with length 6.

    Constraints:

        1 <= s.length <= 104
        s consists of only English letters and spaces ' '.
        There will be at least one word in s.

 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World")); // should be 5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); // should be 3
        System.out.println(lengthOfLastWord("a")); // should be 1
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        if (!s.contains(" ")) {
            return s.length();
        } else {
            for (int i = s.length() - 1; i >= 0; i--)
                if (' ' == s.charAt(i)) return s.length() - 1 - i;
            System.out.println("Harry Kim was here");
            return -1;
        }
    }
}

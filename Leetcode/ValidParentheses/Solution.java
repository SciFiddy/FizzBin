
import java.util.Map;
import java.util.Stack;
/*

                                        https://leetcode.com/problems/valid-parentheses/

        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine
        if the input string is valid.

        An input string is valid if:

            Open brackets must be closed by the same type of brackets.
            Open brackets must be closed in the correct order.
            Every close bracket has a corresponding open bracket of the same type.

        Example 1:

        Input: s = "()"
        Output: true

        Example 2:

        Input: s = "()[]{}"
        Output: true

        Example 3:

        Input: s = "(]"
        Output: false

        Constraints:

            1 <= s.length <= 104
            s consists of parentheses only '()[]{}'

*/

class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("([()][][]{}{}()())"));
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("["));
        System.out.println(isValid("}"));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> yrmp = Map.of(
                ')', '(', '}', '{', ']', '['
        );
        Stack<Character> stacko = new Stack();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stacko.push(s.charAt(i));
                    break;
                case ')':
                case ']':
                case '}':
                    if (stacko.size() <1 || !stacko.pop().equals(yrmp.get(s.charAt(i))))
                        return false;
                    break;
                default:
                    System.out.println("Harry Kim was here");
            }
        }
        if (stacko.size() > 0) return false;
        return true;
    }
}
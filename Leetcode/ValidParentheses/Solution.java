class Solution {

    public static void main(String[] args) {
        System.out.println(isValid("[]"));
    }


    public boolean isValid(String s) {
        HashMap<char, char> yrmp = Map.of(
                '(', ')', '{', '}', '[', ']'
        );

        System.out.println(yrmp);

        return false;
    }
}
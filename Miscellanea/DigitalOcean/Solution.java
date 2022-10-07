package DigitalOcean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {


    public static void main(String[] args) {
        //working from this question set:  https://www.digitalocean.com/community/tutorials/java-programming-interview-questions
        String greeting = "hello world";
        //Q1 - reverse string
        System.out.println(reverse(greeting));  //smart way
        System.out.println(reverseNoStringBuilder(greeting)); // dumb way
        //Q2 - swap two numbers without using a third variable

        System.out.println(swapTwo(1,2));

        //Q3 - check if a vowel is present in the string
        System.out.println(vowelCheck("abc"));

        //Q4 - isPrime

        System.out.println(displayPrime(2));
        System.out.println(displayPrime(-1));
        System.out.println(displayPrime(7127));

        //Q5 - Show some Fibonacci numbers
        System.out.println(displayFib(3));
        System.out.println(displayFib(17));



        //Q6 - Check if list of int has only even numbers
        System.out.println(
                displayOnlyEvens(
                        new ArrayList<>(List.of(1,3,4,5,6))));

        System.out.println(
                displayOnlyEvens(
                        new ArrayList<>(List.of(2,4,6,8,1000))));

        //Q7 -
        System.out.println("radar "+displayPalendrome("radar"));
        System.out.println("raar "+displayPalendrome("raad"));
        System.out.println("asdfsradar "+displayPalendrome("tacocat"));
        System.out.println("1011101 "+displayPalendrome("1011101"));



        //QN -

    }



    private static String displayPalendrome(String input) {
        boolean isPalendrome = true;

        //TODO - fix this for even strings.
        for (int i = 0; i < input.length()/2; i++) {
            System.out.println("looping: " + input.charAt(i) +", "+ input.charAt((input.length() - 1) - i));

            if(input.charAt(i) != input.charAt(input.length()-i-1)) {
                isPalendrome = false;
                break;
            }
        }

        if (isPalendrome) {
            return input + " is a palendrome";
        }
        return input + " is not a palendrome";
    }

    private static String displayOnlyEvens(ArrayList< Integer> list) {
        return "" + list.stream().allMatch(i -> i % 2 == 0);
    }

    private static String displayFib(int i) {
        var output = "Fib("+i+"): ";
        for (int j = 0; j < i; j++) {
            output+= ", "+getFib(j);
        }
        return output+".";
    }

    private static int getFib(int i) {
        if (i <= 1) return i;
        return (getFib(i - 2) + getFib(i - 1));
    }


    private static String vowelCheck(String abc) {

        if(abc.replaceAll("[aeiou]","").length()>0) {
            return abc + " has vowels";
        }
        return abc + " has no vowels";
    }

    private static String displayPrime(int number) {
        if (number <= 0) return number + " is not prime";
        if (number == 1) return number + " is prime";
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2; i <= squareRoot; i++)
            if (number % i == 0)
                return number + " is not prime";
        return number + " is prime";
    }


    private static String swapTwo(int a, int b) {
        var ret = "a: " + a + ", b: " + b;

        b += a;
        a = b - a;
        b -= a;

        return ret + "\na: " + a + ", b: " + b;
    }

    private static String reverseNoStringBuilder(String in) {
        var reversedString = "";

        for (int i = in.length() - 1; i >= 0; i--) {
            reversedString += in.charAt(i);
        }
        return reversedString;
    }


    public static String reverse(String in) {
        return new StringBuilder(in).reverse().toString();
    }

}
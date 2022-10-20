package afteracademy;

// Trying the problem here:  https://afteracademy.com/blog/search-for-a-range-in-sorted-array

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] searchArray = {1,1,2,3,3,4,4,4,5,6,7,8,9,9};
        String out = Arrays.toString(getRange(searchArray,1));
        System.out.println(out);


        out = Arrays.toString(getRange(searchArray,4));
        System.out.println(out);

    }


    private static int[] getRange(int searchArray[], int target){

        int[] returnValues = new int[2];
        returnValues[0]=-1;
        returnValues[1]=-1;

        returnValues[0]=searchLeft(searchArray,target,0,searchArray.length);
        returnValues[1]=searchRight(searchArray,target, 0, searchArray.length);

        return returnValues;
    }

    private static int searchRight(int searchArray[], int target, int start, int end) {

        if (start == end) return start;

        int middle = (end + start+1) / 2;

        if (searchArray[middle] > target) {
            return searchRight(searchArray, target, start, middle-1);
        }else{
            return searchRight(searchArray, target, middle, end);
        }
    }

    private static int searchLeft(int searchArray[], int target, int start, int end) {

        if (start == end) return start;

        int middle = (end + start) / 2;

        if (searchArray[middle] < target) {
            return searchLeft(searchArray, target, middle+1, end);
        }else{
            return searchLeft(searchArray, target, start, middle);
        }
    }


}

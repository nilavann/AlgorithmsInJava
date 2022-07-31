package com.nilavann.problems.easy;
/*

Given an input array height[] representing the heights of buildings, write a program to count the number of
buildings facing the sunset. It is assumed that the heights of all buildings are distinct.

Examples

Input: height[] = [ 7, 4, 8, 2, 9]
Output: 3

Explanation: As 7 is the first element, it can see the sunset.
Similarly, 8 and 9 can see the sunset. 4 and 2 can't see the sunset because 7 and 8 are hiding it.

Input: height[] = [ 2, 3, 4, 5]
Output: 4
 */
public class NumberOfBuildingsFacingTheSun {

    public static int numberOfBuildingsFacingTheSun(int[] heights){
        int result = 1;
        int currMaxHeight = heights[0];
        for ( int i = 1; i < heights.length; i++){
            if( heights[i] > currMaxHeight){
                currMaxHeight = heights[i];
                result++;
            }
        }
        return result;
    }
}

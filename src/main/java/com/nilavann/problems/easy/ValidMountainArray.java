package com.nilavann.problems.easy;

/*

    Given array x[], of n integers, we need to write a program that proves that the array is an valid mountain climber

    An array is said to be mountain climber only if the numbers in the array strictly increases and then strictly decreasing.
 */
public class ValidMountainArray {

    public static boolean validateMountainClimberApproach1(int[] inputArr){

        int i = 0;
        for ( ; i < inputArr.length - 1; i++){
            if( inputArr[i] >= inputArr[i + 1]){
                break;
            }
        }

        if( i == 0 || i == inputArr.length - 1) return false;

        for ( ; i < inputArr.length - 1; i++){
            if( inputArr[i] <= inputArr[i + 1]){
                break;
            }
        }

        return i == inputArr.length - 1;
    }

    public static boolean validateMountainClimberApproach2( int[] inputArr){

        int left = 0;
        int right = inputArr.length - 1;

        while( left < inputArr.length - 1 && inputArr[left] < inputArr[left + 1]){
            left++;
        }

        while( right > 0 && inputArr[right - 1] > inputArr[right]){
            right--;
        }

        return left > 0 && left == right && right < inputArr.length - 1;
    }
}

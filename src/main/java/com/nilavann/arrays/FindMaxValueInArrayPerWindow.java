package com.nilavann.arrays;

/**
 * @author Nilavann
 * @since 31 Aug 2022
 *
 * Given an array of numbers find the largest number at each window.
 */
public class FindMaxValueInArrayPerWindow {

    public static int[] solve( int[] array, int size, int window){
        int[] result = new int[ size - window];
        int index = 0, currentWidow = window, rindex = 0;
        int currentMaxVal = 0;
        for( int num : array){

            while ( index < currentWidow){

                if ( num > currentMaxVal){
                    currentWidow = num;
                }
                index++;
            }
            result[rindex++] = currentMaxVal;
            currentWidow++;
        }
        return result;
    }
}

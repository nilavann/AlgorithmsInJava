package com.nilavann.problems.easy;

/*
    Find the Equilibrium index of the given array a[] of size n.

    An index i of an array a[] is said to be the equilibrium
        if the sum of elements before index i is equal to the sum of the elements after the index

        a[0]+...+a[i-1] = a[i+1] + .. + a[n-1]
 */
public class EquilibriumIndex {

    public static int findEquilibriumApproach1(int[] array){
        int eqIndex = 0;
        int leftSum =0, rightSum = 0;

        for ( int  i = 1; i < array.length; i++){
            rightSum += array[i];
        }

        while ( leftSum != rightSum && eqIndex < array.length - 1) {

            leftSum += array[eqIndex];
            eqIndex++;
            rightSum -= array[eqIndex];
        }

        return leftSum == rightSum ? eqIndex : -1;
    }


    public static int findEquilibriumApproach2(int[] array){

        int leftSum =0, rightSum = 0;

        for ( int  i: array){
            rightSum += array[i];
        }

        for ( int  i = 0; i < array.length; i++){
            rightSum -= array[i];

            if( leftSum == rightSum){
                return  i;
            }
            leftSum += array[i];
        }
        return -1;
    }
}

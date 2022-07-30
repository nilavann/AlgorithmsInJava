package com.nilavann.algorithms;

import java.util.List;

/**
 * @author nalasivam
 * @since 03 Mar 2022
 *
 * Solving the max sub-array sum problem with
 * Kadane's Algorithm.
 */
public class SubArrayMaxSum {

    public static Integer solveSubArrayMaxSum(List<Integer> list){

        if(list.isEmpty()) {
            System.out.println("Given list is empty.");
            return 0;
        }else if( list.size() == 1){
            return list.get(0);
        }

        Integer maxSum = list.get(0), subArrMaxSum = maxSum;

        for(int j = 1; j < list.size(); j++){

            subArrMaxSum += list.get(j);

            if(list.get(j) > subArrMaxSum){
                subArrMaxSum = list.get(j);
            }

            if(subArrMaxSum > maxSum){
                maxSum = subArrMaxSum;
            }
        }
        return maxSum;
    }

    public static int solveSubArrayMaxSumRecursiveSolution(int[] list){
        int maxSum = 0;

        if(list.length > 0) {
            if (list.length == 1) {
                maxSum = list[0];
            } else {
                maxSum = findMaxSubArray( 0, list.length - 1, list)[2];
            }
        }

        return maxSum;
    }

    public static int[] findMaxSubArray(int low,int high, int[] arr){

        if(low == high){
            return new int[]{ low, high, arr[low]};
        }else {
            int mid = low + ( ( high - low) / 2);

            int[] leftMax = findMaxSubArray(low, mid, arr);
            int[] rightMax = findMaxSubArray(mid + 1, high, arr);
            int[] crossMax = findCrossMaxSubArray(low, mid, high, arr);

            if( leftMax[2] >= rightMax[2] && leftMax[2] >= crossMax[2]){
                return  new int[]{ leftMax[0], leftMax[1], leftMax[2]};
            }else if( rightMax[2] >= leftMax[2] && rightMax[2] >= crossMax[2]){
                return  new int[]{rightMax[0], rightMax[1], rightMax[2]};
            }else{
                return  new int[]{ crossMax[0], crossMax[1], crossMax[2]};
            }
        }
    }

    public static int[] findCrossMaxSubArray(int low, int mid, int high, int[] array){
        int leftMaxSum = array[mid];
        int maxSum = leftMaxSum;
        int leftMaxIndex = mid;
        int rightMaxIndex = mid +1;
        int rightMaxSum = array[rightMaxIndex];


        for(int j = mid -1 ; j >= low; j--){
             maxSum += array[j];
             if(maxSum > leftMaxSum){
                 leftMaxSum = maxSum;
                 leftMaxIndex = j;
             }
        }

        maxSum = rightMaxSum;
        for(int j = mid + 2; j <= high; j++){
            maxSum += array[j];
            if(maxSum > rightMaxSum){
                rightMaxSum = maxSum;
                rightMaxIndex = j;
            }
        }


        return new int[]{ leftMaxIndex, rightMaxIndex, leftMaxSum + rightMaxSum};
    }
}

package com.nilavann.problems.easy;

import java.util.ArrayList;
import java.util.List;

/*
    Given an integer array x[], fina all the leaders, a number is said to be leader if it is greater then the
    elements to it's right.

    Note:

        The last element of the array is always the leader.
        The largest element of the array is always the leader.
        Ordering of result doesn't matter.

 */
public class LeaderInAArray {

    public static List<Integer> findLearders(int[] inputArr){

        List<Integer> result = new ArrayList<>();
        int currLeader = inputArr[ inputArr.length - 1];
        result.add( currLeader);

        for( int i = inputArr.length - 2; i >= 0; i--){

            if( inputArr[i] > currLeader){
                currLeader = inputArr[i];
                result.add( inputArr[i]);
            }
        }
        return result;
    }
}

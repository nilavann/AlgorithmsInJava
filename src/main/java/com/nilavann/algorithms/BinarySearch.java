package com.nilavann.algorithms;

import jdk.jshell.execution.RemoteExecutionControl;

import java.util.Arrays;

public class BinarySearch {

    public static int isKeyAvailableInArray( int[] arr, int key, boolean sorted){

        if(!sorted){
            Arrays.sort( arr);
        }

        return binarySearch(arr, key, 0, arr.length - 1, key);
    }

    public static int binarySearch( int[] arr, int key, int low, int high, int minMax){


        if( low > high) return  -1;

        int mid = low + (high - low) / 2;

        if( key > arr[mid] && minMax < key){ minMax = arr[mid];}

        if( arr[mid] == key){
            return key;
        }else if( key > arr[mid]){
            System.out.println( arr[mid]);
            return binarySearch( arr, key, mid + 1, high, minMax);
        }else{
            //System.out.println( arr[mid]);
            return binarySearch( arr, key, low, mid -1, minMax);
        }
    }

    public static int binarySearchIndex( int[] arr, int key, int low, int high, int minIndex){


        if( low > high) return  minIndex;

        int mid = low + (high - low) / 2;

        if( arr[mid] == key){
            return key;
        }else if( key > arr[mid]){
            minIndex = mid;
            return binarySearch( arr, key, mid + 1, high, minIndex);
        }else{
            return binarySearch( arr, key, low, mid -1, minIndex);
        }
    }
}

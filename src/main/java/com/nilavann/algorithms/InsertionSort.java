package com.nilavann.algorithms;

import java.util.List;

public class InsertionSort {

    public static int[] ascendingSort(int[] list){


        int i,currentVal;
        for( int j = 1; j < list.length; j++){
            i = j - 1;
            currentVal = list[j];
            while( i >= 0 && list[i] > currentVal){
                list[i+1] = list[i];
                i -= 1;
            }
            list[i + 1] = currentVal;
        }

        return list;
    }

    public static int[] descendingSort(int[] list){


        int i,currentVal;
        for( int j = 1; j < list.length; j++){
            i = j - 1;
            currentVal = list[j];
            while( i >= 0 && list[i] < currentVal){
                list[i+1] = list[i];
                i -= 1;
            }
            list[i + 1] = currentVal;
        }

        return list;
    }
}

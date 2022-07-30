package com.nilavann.algorithms;

public class SelectionSort {

    public static int[] sortAscending(int[] list){

        int minValIndex, j, temp;
        for(int i = 0; i < list.length; i++){
            j = i + 1;
            minValIndex = i;
            for( ; j < list.length; j++){
                if( list[minValIndex] > list[j]){
                    minValIndex = j;
                }
            }

            temp = list[minValIndex];
            list[minValIndex] = list[i];
            list[i] = temp;

        }

        return list;
    }

    public static int[] sortDescending(int[] list){

        int minValIndex, j, temp;
        for(int i = 0; i < list.length; i++){
            j = i + 1;
            minValIndex = i;
            for( ; j < list.length; j++){
                if( list[minValIndex] < list[j]){
                    minValIndex = j;
                }
            }

            temp = list[minValIndex];
            list[minValIndex] = list[i];
            list[i] = temp;

        }

        return list;
    }
}

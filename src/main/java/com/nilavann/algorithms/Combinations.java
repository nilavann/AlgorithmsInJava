package com.nilavann.algorithms;

import com.nilavann.DymanicProgramming.FibonacciSeries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Combinations {

    public static List<List<Integer>> findCombinations( int n, int k){
        //return getCombinations( n, k, 1, 1);
        //return getCombinations( n, n-k+1, new ArrayList<>());
        return getCombinationsStartAtZero( n - 1, n-k, new ArrayList<>());
    }

    public static List<List<Integer>> getCombinations( int n, int k, int i, int level){

        if( level > k || i > n) {
            List<List<Integer>> outerList = new ArrayList<>();
            if( level > k) {
                List<Integer> innerList = new ArrayList<>();
                outerList.add(innerList);
            }
            return  outerList;
        }

        List<List<Integer>> outerList = getCombinations( n, k,  i + 1, level + 1);
        for ( List<Integer> innerList: outerList){
            innerList.add( i);
        }

        outerList.addAll( getCombinations( n, k,  i + 1, level));
        return outerList;
    }

    public static List<List<Integer>> getCombinations( int n, int end, List<List<Integer>> result){

        if( end > n) return  result;

        List<List<Integer>> outer = new ArrayList<>();
        if( result.isEmpty()){

            int i = 1;
            while( i <= end){

                List<Integer> inner = new ArrayList<>();
                inner.add( i);
                outer.add( inner);
                i++;
            }
        }else {

            for (List<Integer> inner: result) {

                int i = inner.get( inner.size() - 1) + 1;
                while( i <= end){

                    List<Integer> newList = new ArrayList<>( inner);
                    newList.add( i);
                    outer.add( newList);
                    i++;
                }
            }
        }


        return getCombinations( n, end + 1, outer);
    }

    public static List<List<Integer>> getCombinationsStartAtZero( int n, int end, List<List<Integer>> result){

        if( end > n) return  result;

        List<List<Integer>> outer = new ArrayList<>();
        if( result.isEmpty()){

            int i = 0;
            while( i <= end){

                List<Integer> inner = new ArrayList<>();
                inner.add( i);
                outer.add( inner);
                i++;
            }
        }else {

            for (List<Integer> inner: result) {

                int i = inner.get( inner.size() - 1) + 1;
                while( i <= end){

                    List<Integer> newList = new ArrayList<>( inner);
                    newList.add( i);
                    outer.add( newList);
                    i++;
                }
            }
        }

        return getCombinationsStartAtZero( n, end + 1, outer);
    }


}

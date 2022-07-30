package com.nilavann.DymanicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CanHowBestSum {

    public static List<Integer> bestSum(int targetSum, int[] array, List<Integer> result, HashMap<Integer, List<Integer>> memo) {

        if( memo.containsKey( targetSum)){
            return  memo.get( targetSum);
        }
        if( targetSum == 0){
            return new ArrayList<>();
        }

        if( targetSum < 0){
            return null;
        }

        List<Integer> shortestCombination = null;

        for ( int i : array){
            int tSum = targetSum - i;
            List<Integer> subresult = bestSum( tSum, array, result, memo);

            if( subresult != null){
                List<Integer> combination = new ArrayList<>( subresult);
                combination.add( i);
                if( shortestCombination == null || combination.size() < shortestCombination.size()){
                    shortestCombination = combination;
                }

            }
        }

        memo.put( targetSum, shortestCombination);
        return shortestCombination;
    }


    public static List<Integer> bestSumTabulation(int targetSum, int[] nums){
        List<List<Integer>> tabulo = new ArrayList<>(targetSum+1);

        for( int i = 0; i <= targetSum; i++){
            tabulo.add( null);
        }
        tabulo.set(0, new ArrayList<>());
        List<Integer> combination;
        List<Integer> indexedComb;
        for ( int i = 0; i <= targetSum; i++){

            indexedComb = tabulo.get(i);
            if( indexedComb != null){
                for ( int num: nums){
                    if( i + num <= targetSum){
                        combination = tabulo.get( i + num);

                        if( combination == null){
                            combination = new ArrayList<>( indexedComb);
                            combination.add(num);
                            tabulo.set( i + num, combination);
                        } else if( combination.size() > indexedComb.size() + 1){
                            ArrayList<Integer> newComb =  new ArrayList<>( indexedComb);
                            newComb.add( num);
                            tabulo.set( i + num, newComb);
                        }
                    }
                }
            }

        }

        return tabulo.get(targetSum);
    }
}

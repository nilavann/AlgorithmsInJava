package com.nilavann.DymanicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CanHowBestSubString {

    public static boolean canConstruct(String target, String[] wordBank, HashMap<String, Boolean> memo){

        if ( memo.containsKey(target)) return memo.get(target);
        if( target.isBlank()) return true;

        for ( String word: wordBank){
            if ( target.startsWith( word)){

                if( canConstruct( target.substring( word.length()), wordBank, memo)){
                    memo.put( target, true);
                    return true;
                }
            }
        }

        memo.put( target, false);
        return false;
    }


    public static long countConstruct(String target, String[] wordBank, HashMap<String, Long> memo){

        if ( memo.containsKey(target)) return memo.get(target);
        if( target.isBlank()) return 1;
        long count = 0;
        for ( String word: wordBank){
            if ( target.startsWith( word)){

                long numOfWays = countConstruct( target.substring( word.length()), wordBank, memo);
                count += numOfWays;
            }
        }

        memo.put( target, count);
        return count;
    }


    public static List<List<String>> allConstruct(String target, String[] wordBank, HashMap<String, List<List<String>>> memo){

        if ( memo.containsKey(target)) return memo.get(target);
        if( target.isBlank()) {
            List<List<String>> outerList = new ArrayList<>();
            List<String> innerList = new ArrayList<>();
            outerList.add( innerList);
            return  outerList;
        }

        List<List<String>> allcombinations = null;
        for ( String word: wordBank){
            if ( target.startsWith( word)){

                List<List<String>> combinations = allConstruct( target.substring( word.length()), wordBank, memo);

                if ( combinations != null){
                    if( allcombinations == null){
                        allcombinations = new ArrayList<>();
                    }
                    for ( List<String> combination: combinations){
                        combination.add( word);
                        allcombinations.add(combination);
                    }
                }
            }
        }

        memo.put( target, allcombinations);
        return allcombinations;
    }

    public static boolean canConstructTabulation(String target, String[] wordBank){

        boolean[] tabulation = new boolean[target.length() + 1];
        tabulation[0] = true;

        for ( int i = 0; i <= target.length(); i++){

            if( tabulation[i]){

                for ( String word: wordBank){

                    if( target.startsWith( word, i)){
                        tabulation[ i + word.length()] = tabulation[i];
                    }
                }
            }
        }

        return tabulation[target.length()];
    }

    public static long countConstructTabulation(String target, String[] wordBank){

        long[] tabulation = new long[target.length() + 1];
        tabulation[0] = 1;

        for ( int i = 0; i <= target.length(); i++){

            long count = tabulation[i];
            if( count > 0){

                for ( String word: wordBank){

                    if( target.startsWith( word, i)){
                        tabulation[ i + word.length()] += tabulation[i];
                    }
                }
            }
        }

        return tabulation[target.length()];
    }

    public static List<List<String>> allConstructTabulation(String target, String[] wordBank){

        List<List<List<String>>> tabulation = new ArrayList<>();

        for ( int i = 0; i <= target.length(); i++){

            tabulation.add( null);
        }
        List<List<String>> initValue = new ArrayList<>();
        initValue.add( new ArrayList<>());
        tabulation.set( 0, initValue);

        for ( int i = 0; i <= target.length(); i++){

            List<List<String>> allCombs = tabulation.get(i);
            if( allCombs != null){

                for ( String word: wordBank){

                    if( target.startsWith( word, i)){

                        List<List<String>> currentCombs = tabulation.get( i + word.length());

                        if( currentCombs == null){
                            currentCombs = new ArrayList<>();
                            tabulation.set( i + word.length(), currentCombs);
                        }

                        for ( List<String> iCombs : allCombs){
                            List<String> newComb = new ArrayList<>( iCombs);
                            newComb.add( word);
                            currentCombs.add( newComb);
                        }
                    }
                }
            }
        }

        return tabulation.get( target.length());
    }
}

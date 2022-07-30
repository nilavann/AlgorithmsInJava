package com.nilavann.DymanicProgramming;

import java.util.HashMap;

public class FibonacciSeries {

    /*
     * Time: 2^n
     * Space: n
     */
    public static long fib(int n) {
        if (n <= 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    /*
     * Time: 2n
     * Space: n
     */
    public static long fibMemorized(int n) {

        return fibMemorized( n, new HashMap<>());
    }

    /*
     * Time: 2n
     * Space: n
     */
    public static long fibMemorized(int n, HashMap<Integer, Long> memo) {

        if( memo.containsKey(n)) return memo.get(n);

        if (n <= 2) return 1;

        long value = fibMemorized(n - 1, memo) + fibMemorized(n - 2, memo);
        memo.put(n, value);
        return value;
    }
}

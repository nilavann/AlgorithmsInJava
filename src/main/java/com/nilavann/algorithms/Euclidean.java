package com.nilavann.algorithms;

public class Euclidean {

    public static int getGCD(int a, int b){
        if( b == 0){
            return a;
        }else if( a == 0){
            return b;
        }else{
            return getGCD(b, a%b);
        }
    }
}

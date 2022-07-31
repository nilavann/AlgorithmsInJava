package com.nilavann.utilities;

public class RomanNumber {

    public static int getRomanToNumber(Character roman){

        switch( roman){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }

    public static char getNumberToRoman(int number){

        switch( number){

            case 1: return 'I';
            case 5: return 'V';
            case 10: return 'X';
            case 50: return 'L';
            case 100: return 'C';
            case 500: return 'D';
            case 1000: return 'M';
            default: return ' ';
        }
    }
}

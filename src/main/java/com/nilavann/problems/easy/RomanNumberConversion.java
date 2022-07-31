package com.nilavann.problems.easy;

import com.nilavann.utilities.RomanNumber;

public class RomanNumberConversion {


    public static int romanttoInteger( String romanNumber){

        int result = RomanNumber.getRomanToNumber( romanNumber.charAt( romanNumber.length() - 1));
        int prevRomanNumber = result;
        for( int i = romanNumber.length() - 2; i >= 0; i--){

            int currRomanNum = RomanNumber.getRomanToNumber( romanNumber.charAt( i));

            if( currRomanNum < prevRomanNumber){
                result -= currRomanNum;
            }else{
                result += currRomanNum;
            }

            prevRomanNumber = currRomanNum;
        }
        return result;
    }
}

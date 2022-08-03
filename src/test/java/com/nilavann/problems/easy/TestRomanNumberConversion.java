package com.nilavann.problems.easy;

import com.nilavann.utilities.RomanNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestRomanNumberConversion {

    @ParameterizedTest( name = "RomanNumber = {0}, Expected = {1}")
    @CsvSource( value = { "I, 1", "IV, 4", "VI, 6", "IX, 9", "XI, 11", "XL, 40", "MCMIV, 1904", "LVIII, 58", "MCMXCIV, 1994"})
    void fail_if_testcases_fail(String romanNumber, int expected){
        assertEquals( expected, RomanNumberConversion.romanttoInteger( romanNumber));
    }
}

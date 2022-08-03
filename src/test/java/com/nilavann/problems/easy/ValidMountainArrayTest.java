package com.nilavann.problems.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;

import static org.junit.jupiter.api.Assertions.*;

public class ValidMountainArrayTest {

    @Test
    @DisabledForJreRange
    void fail_if_testcases_fails_for_validateMountainClimberApproach1(){

        int[] testcase1 = new int[]{ 5, 2, 1};
        int[] testcase2 = new int[]{ 5, 8, 8};
        int[] testcase3 = new int[]{ 1, 2, 4, 2};
        int[] testcase4 = new int[]{ 5, 8, 8, 7};
        int[] testcase5 = new int[]{ 5, 6, 1};

       assertAll(
                () -> assertFalse( ValidMountainArray.validateMountainClimberApproach1( testcase1)),
                () -> assertFalse( ValidMountainArray.validateMountainClimberApproach1( testcase2)),
                () -> assertTrue( ValidMountainArray.validateMountainClimberApproach1( testcase3)),
                () -> assertFalse( ValidMountainArray.validateMountainClimberApproach1(testcase4)),
                () -> assertTrue( ValidMountainArray.validateMountainClimberApproach1( testcase5))
        );
    }

    @Test
    void fail_if_testcases_fails_for_validateMountainClimberApproach2(){

        int[] testcase1 = new int[]{ 5, 2, 1};
        int[] testcase2 = new int[]{ 5, 8, 8};
        int[] testcase3 = new int[]{ 1, 2, 4, 2};
        int[] testcase4 = new int[]{ 5, 8, 8, 7};
        int[] testcase5 = new int[]{ 5, 6, 1};

        assertAll(
                () -> assertFalse( ValidMountainArray.validateMountainClimberApproach2( testcase1)),
                () -> assertFalse( ValidMountainArray.validateMountainClimberApproach2( testcase2)),
                () -> assertTrue( ValidMountainArray.validateMountainClimberApproach2( testcase3)),
                () -> assertFalse( ValidMountainArray.validateMountainClimberApproach2(testcase4)),
                () -> assertTrue( ValidMountainArray.validateMountainClimberApproach2( testcase5))
        );
    }
}

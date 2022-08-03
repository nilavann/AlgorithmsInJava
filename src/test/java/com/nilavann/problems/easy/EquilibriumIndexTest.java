package com.nilavann.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquilibriumIndexTest {

    @Test
    void fail_if_testcases_fail_for_findEquilibriumApproach1(){

        int[] testcase1 = new int[]{ -7, 1, 5, 2, -4, 3, 0};
        int[] testcase2 = new int[]{ 0, 1, 3, -2, -1};
        int[] testcase3 = new int[]{ 1, 2, -2, -1};

        assertAll(
                () -> assertEquals( 3, EquilibriumIndex.findEquilibriumApproach1( testcase1)),
                () -> assertEquals( 1, EquilibriumIndex.findEquilibriumApproach1( testcase2)),
                () -> assertEquals( -1, EquilibriumIndex.findEquilibriumApproach1( testcase3))
        );
    }

    @Test
    void fail_if_testcases_fail_for_findEquilibriumApproach2(){

        int[] testcase1 = new int[]{ -7, 1, 5, 2, -4, 3, 0};
        int[] testcase2 = new int[]{ 0, 1, 3, -2, -1};
        int[] testcase3 = new int[]{ 1, 2, -2, -1};

        assertAll(
                () -> assertEquals( 3, EquilibriumIndex.findEquilibriumApproach2( testcase1)),
                () -> assertEquals( 1, EquilibriumIndex.findEquilibriumApproach2( testcase2)),
                () -> assertEquals( -1, EquilibriumIndex.findEquilibriumApproach2( testcase3))
        );
    }
}

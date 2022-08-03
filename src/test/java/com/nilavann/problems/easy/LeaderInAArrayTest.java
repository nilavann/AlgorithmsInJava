package com.nilavann.problems.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class LeaderInAArrayTest {

    @Test
    void fail_if_testcases_fails(){

        int[] testcase1 = new int[]{ 16, 17, 4, 3, 5, 2};
        int[] testcase2 = new int[]{ 6, 5, 4, 3, 2, 1};
        int[] testcase3 = new int[]{  1, 2, 3, 4, 5, 6};

        assertAll(
                () -> assertArrayEquals( new Integer[]{ 2, 5, 17}, LeaderInAArray.findLearders( testcase1).toArray( new Integer[0])),
                () -> assertArrayEquals( new Integer[]{ 1, 2, 3, 4, 5, 6}, LeaderInAArray.findLearders( testcase2).toArray( new Integer[0])),
                () -> assertArrayEquals( new Integer[]{ 6}, LeaderInAArray.findLearders( testcase3).toArray( new Integer[0]))
        );
    }
}

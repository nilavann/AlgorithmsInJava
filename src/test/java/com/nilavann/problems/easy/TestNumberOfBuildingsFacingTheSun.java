package com.nilavann.problems.easy;

import com.nilavann.problems.easy.NumberOfBuildingsFacingTheSun;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumberOfBuildingsFacingTheSun {

    @Test
    void success_if_testcase_passes_for_numberOfBuildingsFacingTheSun(){

        int[] testcase1 = new int[]{ 7, 4, 8, 2, 9};
        int[] testcase2 = new int[]{ 2, 3, 4, 5};

        int result1 = NumberOfBuildingsFacingTheSun.numberOfBuildingsFacingTheSun( testcase1);
        int result2 = NumberOfBuildingsFacingTheSun.numberOfBuildingsFacingTheSun( testcase2);

        assertAll(
                () -> assertEquals( 3, result1),
                () -> assertEquals( 4, result2)
        );
    }
}

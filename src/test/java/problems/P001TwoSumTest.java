package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P001TwoSumTest {
    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void twoSumTest(int[] nums, int target, int[] expected) {
        P001TwoSum obj = new P001TwoSum();
        assertArrayEquals(expected, obj.twoSum(nums,target));
    }
    private static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of(new int[]{2,7,11,15}, 9, new int[]{0,1}),
                Arguments.of(new int[]{3,2,4}, 6, new int[]{1,2}),
                Arguments.of(new int[]{3,3}, 6, new int[]{0,1})
        );
    }
}
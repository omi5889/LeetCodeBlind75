package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P300LongestIncreasingSubsequenceTest {
    @ParameterizedTest
    @MethodSource("p300TestCases")
    void p300Test(int[] nums, int expected) {
        P300LongestIncreasingSubsequence obj = new P300LongestIncreasingSubsequence();
        assertEquals(expected, obj.lengthOfLIS(nums));
    }
    private static Stream<Arguments> p300TestCases() {
        return Stream.of(
                Arguments.of(new int[]{10,9,2,5,3,7,101,18}, 4),
                Arguments.of(new int[]{0,1,0,3,2,3}, 4),
                Arguments.of(new int[]{7,7,7,7,7,7,7}, 1),
                Arguments.of(new int[]{3,4,-1,0,6,2,3}, 4)
        );
    }
}
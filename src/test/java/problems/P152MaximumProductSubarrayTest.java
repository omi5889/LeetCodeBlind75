package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P152MaximumProductSubarrayTest {

    @ParameterizedTest
    @MethodSource("maxProductSubarrayTestCases")
    void maxProductSubarrayTest(int[] nums, int expected) {
        P152MaximumProductSubarray obj = new P152MaximumProductSubarray();
        assertEquals(expected, obj.maxProduct(nums));

    }
    private static Stream<Arguments> maxProductSubarrayTestCases() {
        return Stream.of(
                Arguments.of(new int[]{2,3,-2,4}, 6),
                Arguments.of(new int[]{-2,0,-1}, 0)
        );
    }

}
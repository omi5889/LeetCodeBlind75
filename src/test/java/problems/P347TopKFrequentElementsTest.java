package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P347TopKFrequentElementsTest {
    @ParameterizedTest
    @MethodSource("topKFrequentTestCases")
    void topKFrequentTest(int[] nums, int k, int[] expected) {
        P347TopKFrequentElements obj = new P347TopKFrequentElements();
        assertArrayEquals(expected, obj.topKFrequent(nums, k));
    }
    private static Stream<Arguments> topKFrequentTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1,1,1,2,2,3}, 2, new int[]{1,2}),
                Arguments.of(new int[]{1}, 1, new int[]{1})
        );
    }
}
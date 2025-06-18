package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P128LongestConsecutiveSequenceTest {
    @ParameterizedTest
    @MethodSource("testCases")
    void longestConsecutiveSequence(int[] nums, int expected) {
        P128LongestConsecutiveSequence obj = new P128LongestConsecutiveSequence();
        assertEquals(expected, obj.longestConsecutive(nums));
    }
    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{100,4,200,1,3,2},4)
        );
    }
}
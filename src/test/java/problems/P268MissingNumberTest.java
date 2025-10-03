package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P268MissingNumberTest {
    @ParameterizedTest
    @MethodSource("missingNumberTestCases")
    void missingNumberTest (int[] nums, int expected) {
        P268MissingNumber obj = new P268MissingNumber();
        assertEquals(expected, obj.missingNumber(nums));
    }
    private static Stream<Arguments> missingNumberTestCases() {
        return Stream.of(
                Arguments.of(new int[]{3,0,1}, 2),
                Arguments.of(new int[]{0,1}, 2),
                Arguments.of(new int[]{9,6,4,2,3,5,7,0,1}, 8)
        );
    }
}
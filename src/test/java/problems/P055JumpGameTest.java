package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P055JumpGameTest {
    @ParameterizedTest
    @MethodSource("jumpGameTestCases")
    void jumpGameTest(int[] nums, boolean expected) {
        P055JumpGame obj = new P055JumpGame();
        assertEquals(expected, obj.canJump(nums));
    }
    private static Stream<Arguments> jumpGameTestCases() {
        return Stream.of(
                Arguments.of(new int[]{2,3,1,1,4}, true),
                Arguments.of(new int[]{3,2,1,0,4}, false)
        );
    }
}
package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P213HouseRobberIITest {
    @ParameterizedTest
    @MethodSource("p213TestCases")
    void p213Test(int[] nums, int expected) {
        P213HouseRobberII obj = new P213HouseRobberII();
        assertEquals(expected, obj.rob(nums));
    }
    private static Stream<Arguments> p213TestCases() {
        return Stream.of(
                Arguments.of(new int[]{2,3,2},3),
                Arguments.of(new int[]{1,2,3,1},4),
                Arguments.of(new int[]{1,2,3},3)
        );
    }
}
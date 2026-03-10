package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P070ClimbingStairsTest {
    @ParameterizedTest
    @MethodSource("p070TestCases")
    void p070Test(int n, int expected) {
        P070ClimbingStairs obj = new P070ClimbingStairs();
        assertEquals(expected, obj.climbStairs(n));
    }
    private static Stream<Arguments> p070TestCases() {
        return Stream.of(
                Arguments.of(2, 2),
                Arguments.of(3, 3)
        );
    }
}
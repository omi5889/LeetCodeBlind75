package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P091DecodeWaysTest {
    @ParameterizedTest
    @MethodSource("decodeWaysTestCases")
    void decodeWaysTest(String s, int expected) {
        P091DecodeWays obj = new P091DecodeWays();
        assertEquals(expected, obj.numDecodings(s));
    }
    private static Stream<Arguments> decodeWaysTestCases() {
        return Stream.of(
                Arguments.of("12", 2),
                Arguments.of("226", 3),
                Arguments.of("06", 0)
        );
    }
}
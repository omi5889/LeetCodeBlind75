package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P076MinimumWindowSubstringTest {
    @ParameterizedTest
    @MethodSource("minimumWindowTestCases")
    void minimumWindowSubstring(String s, String t, String expected) {
        P076MinimumWindowSubstring obj = new P076MinimumWindowSubstring();
        assertEquals(expected, obj.minWindow(s,t));
    }
    private static Stream<Arguments> minimumWindowTestCases() {
        return Stream.of(
                Arguments.of("ADOBECODEBANC", "ABC", "BANC"),
                Arguments.of("a", "a", "a"),
                Arguments.of("a", "aa", ""),
                Arguments.of("a", "b", "")
        );
    }

}
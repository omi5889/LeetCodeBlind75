package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P647PalindromicSubstringsTest {
    @ParameterizedTest
    @MethodSource("palindromicSubstring")
    void palindromicSubstrings(String s, int expected) {
        P647PalindromicSubstrings obj = new P647PalindromicSubstrings();
        assertEquals(expected, obj.countSubstrings(s));
    }
    private static Stream<Arguments> palindromicSubstring() {
        return Stream.of(
                Arguments.of("abc", 3),
                Arguments.of("aaa", 6)
        );
    }
}
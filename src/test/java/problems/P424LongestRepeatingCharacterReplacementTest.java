package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P424LongestRepeatingCharacterReplacementTest {
    @ParameterizedTest
    @MethodSource("p424TestCases")
    void p424Test(String s, int k, int expected) {
        P424LongestRepeatingCharacterReplacement obj = new P424LongestRepeatingCharacterReplacement();
        assertEquals(expected, obj.characterReplacement(s,k));
    }
    private static Stream<Arguments> p424TestCases() {
        return Stream.of(
                Arguments.of("ABAB", 2, 4),
                Arguments.of("AABABBA", 1, 4)
        );
    }
}
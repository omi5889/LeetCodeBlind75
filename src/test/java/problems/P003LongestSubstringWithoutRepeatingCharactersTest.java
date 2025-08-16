package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P003LongestSubstringWithoutRepeatingCharactersTest {

    @ParameterizedTest
    @MethodSource("repeatingCharactersTestCases")
    void longestSubstring(String s, int expected) {
        P003LongestSubstringWithoutRepeatingCharacters obj = new P003LongestSubstringWithoutRepeatingCharacters();
        assertEquals(expected, obj.lengthOfLongestSubstring(s));
    }
    private static Stream<Arguments> repeatingCharactersTestCases() {
        return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of(" ", 1)
        );
    }
}
package problems;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P005LongestPalindromicSubstringTest {

    @ParameterizedTest
    @MethodSource("longestPalindromeTestCases")
    void longestPalindrome(String s, String expected) {
        P005LongestPalindromicSubstring obj = new P005LongestPalindromicSubstring();
        assertEquals(expected, obj.longestPalindrome(s));
    }
    private static Stream<Arguments> longestPalindromeTestCases() {
        return Stream.of(
                Arguments.of("babad","bab"),
                Arguments.of("cbbd","bb")
        );
    }
}
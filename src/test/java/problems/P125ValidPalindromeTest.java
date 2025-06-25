package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P125ValidPalindromeTest {
    @ParameterizedTest
    @MethodSource("validPalindromeTestCases")
    void validPalindromeTest(String s, boolean expected) {
        P125ValidPalindrome obj = new P125ValidPalindrome();
        assertEquals(expected, obj.isPalindrome(s));
    }
    private static Stream<Arguments> validPalindromeTestCases() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("race a car", false),
                Arguments.of(" ", true)
        );
    }

}
package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P242ValidAnagramTest {
    @ParameterizedTest
    @MethodSource("validAnagramTestCases")
    void validAnagramTest(String s, String t, boolean expected) {
        P242ValidAnagram obj = new P242ValidAnagram();
        assertEquals(expected, obj.isAnagram(s, t));
    }
    private static Stream<Arguments> validAnagramTestCases() {
        return Stream.of(
                Arguments.of("anagram", "nagaram", true),
                Arguments.of("car","rat", false)
        );
    }
}
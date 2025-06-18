package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P269AlienDictionaryTest {
    @ParameterizedTest
    @MethodSource("alienDictionaryTestCases")
    void alienDictionary(String[] words, String expected) {
        P269AlienDictionary obj = new P269AlienDictionary();
        assertEquals(expected, obj.alienOrder(words));
    }
    private static Stream<Arguments> alienDictionaryTestCases() {
        return Stream.of(
                Arguments.of(new String[]{"wrt","wrf","er","ett","rftt"}, "wertf")
        );
    }
}
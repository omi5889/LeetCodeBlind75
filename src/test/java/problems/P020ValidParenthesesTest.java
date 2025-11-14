package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P020ValidParenthesesTest {
    @ParameterizedTest
    @MethodSource("validParenthesesTestCases")
    void validParenthesesTest(String s, boolean expected) {
        P020ValidParentheses obj = new P020ValidParentheses();
        assertEquals(expected, obj.isValid(s));
    }
    private static Stream<Arguments> validParenthesesTestCases() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("([])", true),
                Arguments.of("(]", false),
                Arguments.of("([)]",false)
        );
    }
}
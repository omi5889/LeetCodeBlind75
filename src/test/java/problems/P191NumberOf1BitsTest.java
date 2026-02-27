package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P191NumberOf1BitsTest {
    @ParameterizedTest
    @MethodSource("p191TestCases")
    void p191TestCase(int n, int expected) {
        P191NumberOf1Bits obj = new P191NumberOf1Bits();
        assertEquals(expected, obj.hammingWeight(n));
    }
    private static Stream<Arguments> p191TestCases() {
        return Stream.of(
                Arguments.of(128,1),
                Arguments.of(11,3),
                Arguments.of(2147483645,30)
        );
    }
}
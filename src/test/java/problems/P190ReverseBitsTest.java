package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P190ReverseBitsTest {
    @ParameterizedTest
    @MethodSource("reverseBitTestCases")
    void reverseBitTest(int n, int expected){
        P190ReverseBits obj = new P190ReverseBits();
        assertEquals(expected, obj.reverseBits(n));
    }
    private static Stream<Arguments> reverseBitTestCases() {
        return Stream.of(
                Arguments.of()
        );
    }
}
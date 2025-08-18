package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P371SumOfTwoIntegersTest {
    @ParameterizedTest
    @MethodSource("sumTwoNumbersTestCases")
    void sumTwoNumbersTest(int a, int b, int expected) {
        P371SumOfTwoIntegers obj = new P371SumOfTwoIntegers();
        assertEquals(expected, obj.getSum(a,b));
    }
    private static Stream<Arguments> sumTwoNumbersTestCases() {
        return Stream.of(
                Arguments.of(1,2,3),
                Arguments.of(3,2,5)
        );
    }
}
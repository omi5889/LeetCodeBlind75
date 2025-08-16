package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class P039CombinationSumTest {
    @ParameterizedTest
    @MethodSource("combinationTestCases")
    void combinationTest(int[] candidates, int target) {

    }
    private static Stream<Arguments> combinationTestCases() {
        return Stream.of(
                Arguments.of()
        );
    }
}
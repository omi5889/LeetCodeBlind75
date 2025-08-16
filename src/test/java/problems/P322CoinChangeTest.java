package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P322CoinChangeTest {
    @ParameterizedTest
    @MethodSource("coinChangeTestCases")
    void coinChangeTest(int[] coins, int amount, int expected) {
        P322CoinChange obj= new P322CoinChange();
        assertEquals(expected, obj.coinChange(coins, amount));
    }
    private static Stream<Arguments> coinChangeTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1,2,5}, 11, 3),
                Arguments.of(new int[]{2}, 3, -1),
                Arguments.of(new int[]{1}, 0, 0)
        );
    }
}
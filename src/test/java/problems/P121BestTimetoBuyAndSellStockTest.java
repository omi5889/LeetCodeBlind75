package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P121BestTimetoBuyAndSellStockTest {
    @ParameterizedTest
    @MethodSource("buySellStocksTestCases")
    void buySellStockTest(int[] prices, int expected) {
        P121BestTimetoBuyAndSellStock obj = new P121BestTimetoBuyAndSellStock();
        assertEquals(expected, obj.maxProfit(prices));
    }
    private static Stream<Arguments> buySellStocksTestCases() {
        return Stream.of(
                Arguments.of(new int[]{7,1,5,3,6,4}, 5),
                Arguments.of(new int[]{7,6,4,3,1}, 0)
        );
    }
}
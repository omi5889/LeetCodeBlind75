package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P0153SumTest {
    @ParameterizedTest
    @MethodSource("threeSumTestCases")
    void threeSumTest(int[] nums, int[][] expected) {
        P0153Sum obj = new P0153Sum();
        List<List<Integer>> res = obj.threeSum(nums);
        int[][] res2 = res.stream()
                .map(list -> list.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);

        assertArrayEquals(res2,expected);
    }

    private static Stream<Arguments> threeSumTestCases() {
        return Stream.of(
                Arguments.of(new int[]{-1,0,1,2,-1,-4}, new int[][]{{-1, -1, 2},{-1, 0, 1}})
        );

    }
}
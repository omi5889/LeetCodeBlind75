package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P261GraphValidTreeTest {
    @ParameterizedTest
    @MethodSource("graphValidTreeTestCases")
    void graphValidTree(int n, int[][] edges, boolean expected) {
        P261GraphValidTree obj = new P261GraphValidTree();
        assertEquals(expected, obj.validTree(n,edges));

    }
    private static Stream<Arguments> graphValidTreeTestCases() {
        return Stream.of(
                Arguments.of(5, new int[][]{{0,1},{0,2},{0,3},{1,4}}, true)
        );
    }

}
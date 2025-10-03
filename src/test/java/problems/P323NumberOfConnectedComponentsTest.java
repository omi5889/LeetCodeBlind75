package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P323NumberOfConnectedComponentsTest {
    @ParameterizedTest
    @MethodSource("connectedComponentsTestCases")
    void connectedComponents(int n, int[][] edges, int expected) {
        P323NumberOfConnectedComponents obj = new P323NumberOfConnectedComponents();
        assertEquals(expected, obj.countComponents(n, edges));
    }
    private static Stream<Arguments> connectedComponentsTestCases() {
        return Stream.of(
                Arguments.of(6, new int[][]{{0,1}, {0,2}, {3,4}}, 3)
        );
    }
}
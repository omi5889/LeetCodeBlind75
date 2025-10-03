package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P207CourseScheduleTest {
    @ParameterizedTest
    @MethodSource("courseScheduleTestCases")
    void courseScheduleTest(int numCourses, int[][] prerequisites, boolean expected) {
        P207CourseSchedule obj = new P207CourseSchedule();
        assertEquals(expected, obj.canFinish(numCourses, prerequisites));
    }
    private static Stream<Arguments> courseScheduleTestCases() {
        return Stream.of(
                Arguments.of(2, new int[][]{{1,0}}, true),
                Arguments.of(2, new int[][]{{1,0},{0,1}}, false)
        );
    }
}
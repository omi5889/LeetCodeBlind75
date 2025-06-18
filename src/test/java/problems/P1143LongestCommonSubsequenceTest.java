package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P1143LongestCommonSubsequenceTest {
    @ParameterizedTest
    @MethodSource("lcsTestCases")
    void lcs(String text1, String text2, int expected) {
        P1143LongestCommonSubsequence obj = new P1143LongestCommonSubsequence();
        assertEquals(expected, obj.longestCommonSubsequence(text1,text2));
    }
    private static Stream<Arguments> lcsTestCases() {
        return Stream.of(
                Arguments.of("abcde","ace",3),
                Arguments.of("abc","abc",3),
                Arguments.of("abc","def",0)
        );
    }
}
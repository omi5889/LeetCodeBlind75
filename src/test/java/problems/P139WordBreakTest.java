package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P139WordBreakTest {
    @ParameterizedTest
    @MethodSource("wordBreakTestCases")
    void wordBreakTest(String s, List<String> wordDict, boolean expected) {
        P139WordBreak obj = new P139WordBreak();
        assertEquals(expected,obj.wordBreak(s,wordDict));
    }
    private static Stream<Arguments> wordBreakTestCases() {
        return Stream.of(
                Arguments.of("leetcode", List.of("leet","code"),true),
                Arguments.of("applepenapple", List.of("apple","pen"),true),
                Arguments.of("catsandog", List.of("cats","dog","sand","and","cat"),false)
        );
    }
}
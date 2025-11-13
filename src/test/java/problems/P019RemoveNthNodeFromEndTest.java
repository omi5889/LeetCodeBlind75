package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import util.ListNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P019RemoveNthNodeFromEndTest {
    @ParameterizedTest
    @MethodSource("removeNthNodeTestCases")
    void removeNthNodeTest(ListNode head, int n, ListNode expected) {
        P019RemoveNthNodeFromEnd obj = new P019RemoveNthNodeFromEnd();
        ListNode res = obj.removeNthFromEnd(head, n);
        boolean testResult = true;
        while(res!=null && expected!=null) {
            if(res.val!=expected.val) {
                testResult = false;
                break;
            }
            res = res.next;
            expected = expected.next;
        }
        assertTrue(testResult);

    }
    private static Stream<Arguments> removeNthNodeTestCases() {
        return Stream.of(
                Arguments.of(new ListNode().getList(new int[]{11,22,33,44,55,66}), 3, new ListNode().getList(new int[]{11,22,33,55,66})),
                Arguments.of(new ListNode().getList(new int[]{1,2,3,4,5}), 2, new ListNode().getList(new int[]{1,2,3,5})),
                Arguments.of(new ListNode().getList(new int[]{1}), 1, new ListNode().getList(new int[]{})),
                Arguments.of(new ListNode().getList(new int[]{1,2}), 1, new ListNode().getList(new int[]{1}))
        );
    }

}
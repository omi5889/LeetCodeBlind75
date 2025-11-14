package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import util.ListNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P022MergeKSortedListsTest {
    @ParameterizedTest
    @MethodSource("mergeKSortedListsTestCases")
    void mergeKSortedListsTest(ListNode[] lists, ListNode expected) {
        P022MergeKSortedLists obj = new P022MergeKSortedLists();
        assertTrue(ListNode.compareLinkedList(obj.mergeKLists(lists), expected));
    }
    private static Stream<Arguments> mergeKSortedListsTestCases() {
        return Stream.of(
                Arguments.of(new ListNode[]{
                        ListNode.getList(new int[]{1,4,5}),
                        ListNode.getList(new int[]{1,3,4}),
                        ListNode.getList(new int[]{2,6})
                }, ListNode.getList(new int[]{1,1,2,3,4,4,5,6})),
                Arguments.of(new ListNode[]{}, ListNode.getList(new int[]{})),
                Arguments.of(new ListNode[]{
                        ListNode.getList(new int[]{}),
                }, ListNode.getList(new int[]{}))
        );
    }
}
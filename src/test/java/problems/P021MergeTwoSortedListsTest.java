package problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import util.ListNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P021MergeTwoSortedListsTest {
    @ParameterizedTest
    @MethodSource("mergeTwoSortedListTestCases")
    void mergeTwoSortedListTest(ListNode list1, ListNode list2, ListNode expected) {
        P021MergeTwoSortedLists obj = new P021MergeTwoSortedLists();
        assertTrue(ListNode.compareLinkedList(expected, obj.mergeTwoLists(list1,list2)));

    }
    private static Stream<Arguments> mergeTwoSortedListTestCases() {
        return Stream.of(
                Arguments.of(ListNode.getList(new int[]{1,2,4}), ListNode.getList(new int[]{1,3,4}), ListNode.getList(new int[]{1,1,2,3,4,4})),
                Arguments.of(ListNode.getList(new int[]{}), ListNode.getList(new int[]{}), ListNode.getList(new int[]{})),
                Arguments.of(ListNode.getList(new int[]{}), ListNode.getList(new int[]{0}), ListNode.getList(new int[]{0}))
        );
    }
}
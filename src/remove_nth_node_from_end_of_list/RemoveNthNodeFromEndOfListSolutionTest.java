package remove_nth_node_from_end_of_list;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import utils.ListNode;

public class RemoveNthNodeFromEndOfListSolutionTest {
    @Test
    public void when_1_2_3_4_5_Then_1_2_3_5() {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        RemoveNthNodeFromEndOfListSolution solution = new RemoveNthNodeFromEndOfListSolution();
        ListNode res = solution.solve(head, 2);

        assertEquals(3, res.next.next.val);
        assertEquals(5, res.next.next.next.val);
        assertEquals(null, res.next.next.next.next);
    }

    @Test
    public void when_1_Then_Null() {
        
        ListNode head = new ListNode(1);
        
        RemoveNthNodeFromEndOfListSolution solution = new RemoveNthNodeFromEndOfListSolution();
        ListNode res = solution.solve(head, 1);

        assertEquals(null, res);

    }

    @Test
    public void when_1_2_Then_1() {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        
        RemoveNthNodeFromEndOfListSolution solution = new RemoveNthNodeFromEndOfListSolution();
        ListNode res = solution.solve(head, 1);

        assertEquals(1, res.val);

    }
}

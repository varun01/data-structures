package com.learning.leetcodeproblems;

import com.learning.pojo.ListNode;

/**
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode intersectionListNode = null;
        int headALen = getNodeCount(headA);
        int headBLen = getNodeCount(headB);
        int diff = headALen > headBLen ? headALen - headBLen : headBLen - headALen;
        if (headALen > headBLen) {
            headA = incrementNodePointer(diff, headA);
            intersectionListNode = getIntersectingNode(headA, headB);
        } else if (headBLen > headALen) {
            headB = incrementNodePointer(diff, headB);
            intersectionListNode = getIntersectingNode(headB, headA);
        } else {
            intersectionListNode = getIntersectingNode(headB, headA);
        }
        return intersectionListNode;
    }

    private int getNodeCount(ListNode listNode) {
        int count = 0;
        while (listNode != null) {
            count++;
            listNode = listNode.next;
        }
        return count;
    }

    private ListNode incrementNodePointer(int diff, ListNode node) {
        for (int i = 0; i < diff; i++) {
            node = node.next;
        }
        return node;
    }

    private ListNode getIntersectingNode(ListNode node1, ListNode node2) {
        ListNode node = null;

        while (node1 != null && node2 != null) {
            if (node1.val == node2.val) {
                node = node1;
                break;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(9);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(2);
        node.next.next.next.next = new ListNode(4);

        ListNode node1 = new ListNode(3);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(4);
        IntersectionOfTwoLinkedLists intersection = new IntersectionOfTwoLinkedLists();
        System.out.println(intersection.getIntersectionNode(node, node1).val);
    }
}

package com.solutions.leetcode.linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

//Delete Node in a Linked List
//https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/553/

class DeleteLinkedListNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
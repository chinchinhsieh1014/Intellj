package org.example;
// the start of a linked list: the head
// the end of a linked list: the tail
public class sentinelNodes {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode prev;
        ListNode (int val) {
            this.val = val;
        }
    }
    public static void addToEnd(ListNode nodeToAdd, ListNode tail) {
        nodeToAdd.next = tail;
        nodeToAdd.prev = tail.prev;
        tail.prev.next = nodeToAdd;
        tail.prev = nodeToAdd;
    }

    public static void removeFromEnd(ListNode head, ListNode tail) {
        if (head.next == tail) {
            return;
        }

        ListNode nodeToRemove = tail.prev;
        nodeToRemove.prev.next = tail;
        tail.prev = nodeToRemove.prev;
    }

    public static void addToStart(ListNode nodeToAdd, ListNode head) {
        nodeToAdd.prev = head;
        nodeToAdd.next = head.next;
        head.next.prev = nodeToAdd;
        head.next = nodeToAdd;
    }

    public static void removeFromStart(ListNode head, ListNode tail) {
        if (head.next == tail) {
            return;
        }

        ListNode nodeToRemove = head.next;
        nodeToRemove.next.prev = head;
        head.next = nodeToRemove.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-1);
        ListNode tail = new ListNode(-1);
        head.next = tail;
        tail.prev = head;
    }
}

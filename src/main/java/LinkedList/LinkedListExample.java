package org.example;

public class LinkedListExample {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode (int val) {
            this.val = val;
        }
    }

    // add a node
    public static void addNode(ListNode prevNode, ListNode nodeToAdd) {
        nodeToAdd.next = prevNode.next;
        prevNode.next = nodeToAdd;
    }
    // delete a node
    public static void deleteNode(ListNode preNode) {
        preNode.next = preNode.next.next;
    }
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode head = one;
        one.next = two;
        two.next = three;
        while (head!= null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}

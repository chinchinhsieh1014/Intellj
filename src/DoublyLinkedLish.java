package org.example;

public class DoublyLinkedLish {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode prev;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static void addNode(ListNode node, ListNode nodeToAdd) {
        ListNode prevNode = node.prev;
        nodeToAdd.next = node;
        nodeToAdd.prev = prevNode;
        prevNode.next = nodeToAdd;
        node.prev = nodeToAdd;
    }
    public static void deleteNode(ListNode node) {
        ListNode prevNode = node.prev;
        ListNode nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
    public static void main(String[] args) {

    }
}

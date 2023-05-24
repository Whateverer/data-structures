package datastructures;

public class LinkedListSample {
    // linked list의 장점 : 삽입과 삭제가 빠르다. O(1)
    // Doubly Linked List
    public static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void deleteWithValue(int data) {
        if(head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }
}

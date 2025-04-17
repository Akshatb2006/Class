public class DoublyLinkedList {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.prev = head;
            head.next = head;
        } else {
            Node last = head.prev;
            last.next = newNode;
            newNode.prev = last;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    public void print() {
        if (head == null) {
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + "->");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public void dissect(int m, int k) {
        if (head == null) {
            return;
        }

        Node current = head;
        int count = 0;
        while (current != head.prev) {
            current = current.next;
            count++;
        }

        if (k > count) {
            System.out.println("Invalid k value");
            return;
        }

        Node secondHead = null;
        current = head;
        for (int i = 0; i < k - 1; i++) {
            current = current.next;
        }
        secondHead = current.next;

        current.next = head;
        secondHead.prev = null;

        Node firstTail = head.prev;
        firstTail.next = head;
        head.prev = firstTail;

        Node secondTail = secondHead.prev;
        secondTail.next = secondHead;
        secondHead.prev = secondTail;

        System.out.println("First circular linked list:");
        current = head;
        do {
            System.out.print(current.data + "->");
            current = current.next;
        } while (current != head);
        System.out.println();

        System.out.println("Second circular linked list:");
        current = secondHead;
        do {
            System.out.print(current.data + "->");
            current = current.next;
        } while (current != secondHead);
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        int m = 9; 
        char data = 'A'; 

        int i = 0;
        while (i < m) {
            dll.insert(data);
            data++;
            i++;
        }

        dll.print();

        dll.dissect(m, 5);
    }
}
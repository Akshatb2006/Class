public class DeleteDCLL {
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

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            Node newHead = head.next;
            newHead.prev = newHead;
            head.prev.next = newHead;
            head = newHead;
        }
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            Node newLast = head.prev;
            newLast.next = newLast;
            head.prev = newLast;
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

    public static void main(String[] args) {
        DeleteDCLL list = new DeleteDCLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.print();
        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();
    }
}
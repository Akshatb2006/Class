
public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node A = new Node(2);
        Node B = new Node(3);
        Node C = new Node(4);

        head.next = A;
        A.next = B;
        B.next = C;

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class CircularLinkedList {
    class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        Node Data1 = list.new Node(1);
        Node Data2 = list.new Node(2);
        Node Data3 = list.new Node(3);
        Node Data4 = list.new Node(4);
        Node Data5 = list.new Node(5);
        Node Data6 = list.new Node(6);
        
        Data1.next = Data2;
        Data2.next = Data3;
        Data3.next = Data4;
        Data4.next = Data5;
        Data5.next = Data1;
        //Deletion in circular linked list
        //Data2.next=Data4;

        //inserting data 6 between 4 an 5
        Data4.next = Data6;
        Data6.next = Data5;

        
        Node current = Data1;
        int count = 0;
        
        while (count < 10) { 
            System.out.print(current.data + " ");
            current = current.next;
            count++;
        }
        
    }
}

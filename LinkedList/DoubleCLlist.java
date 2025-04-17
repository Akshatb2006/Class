//create a doubly circular linked list having n nodes and delete n-1th node
public class DoubleCLlist {
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    int head=0;
    int last=0;
    public static void main(String[] args) {
        DoubleCLlist list = new DoubleCLlist();
        Node head = list.new Node(1);
        Node last = list.new Node(0);
        head.prev = last;
        last.next = head;
        while (true) {
            System.out.print(head.data + "->");
            head = head.next;
            last = last.prev;
            if (head == null) {
                break;
            }
        }
    }
}



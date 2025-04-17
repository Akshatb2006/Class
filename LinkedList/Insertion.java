// //create a linked list haveing 3 data memebers name roll no and a boolean present
// // by default everyone would be absent


public class Insertion {
    String name;
    String roll;
    boolean present;
    Insertion next;

    public Insertion(String name, String roll, boolean b) {
        this.name = name;
        this.roll = roll;
        this.present = true;
        this.next = null;
    }

    public static void main(String[] args) {
        
        Insertion Student1 = new Insertion("A", "1", true);
        Insertion Student2 = new Insertion("B", "2", true);
        Insertion Student3 = new Insertion("C", "3", true);
        Insertion Student4 = new Insertion("D", "4", true);

        Student1.next = Student2;
        
        Student4.next = Student3;

        Student2.next = Student4;

        Insertion current = Student1;
        while (current != null) {
            System.out.println("Name: " + current.name + ", Roll: " + current.roll + ", Present: " + current.present);
            current = current.next;
        }
    }
}

//Write a code to insert a new node at position three
// public class Insertion {
//     static class Node{
//     int data;
//     Node next;

//     public Node(int data){
//         this.data=data;
//         this.next=null;
//     }
//     }
//     public static void main(String[] args){
//         Node head = new Node(1);
//         Node current = head;
//         for(int i=2; i<=5; i++){
//             current.next=new Node(i);
//             current=current.next;
//         }
//         current = head;
//         for(int i=0; i<3; i++){
//             current=current.next;
//         }
//         Node newNode= new Node(6);
//         newNode.next=current.next;
//         current.next=newNode;
        
//         current=head;
//         while(current != null){
//             System.out.print(current.data+"-->");
//             current=current.next;
//         }
//         System.out.println("null");
//     }
// }



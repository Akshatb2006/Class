//create a singly linked list of size m taken from the user
//insert a node having value 'x' at position 'y' both taken by the user
//delete this new node

import  java.util.Scanner;
class Node{
   int data;
   Node next;
   Node(int data){
      this.data=data;
      this.next=null;
   }
   public class Custom_Linked{
      public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Length of Linked_List");
         int count=sc.nextInt();
         System.out.println("At which Position you wants to insert a node");
         int post=sc.nextInt();
         System.out.println("Write the value of that node");
         int value=sc.nextInt();
         Node head=new Node(0);
         Node temp=head;
         while(count>0){
         Node temp1=new Node(0); 
         temp.next=temp1;
         temp=temp1.next;
         count--;
         }
         temp=head;
         int ins=1;
         while(ins<post){
            temp=temp.next;
         }
         Node temp2=new Node(value);
         temp2.next=temp.next;
         temp.next=temp2;
      }
   }
   }
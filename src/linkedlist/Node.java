package linkedlist;
//given N>0, create a linked list which contains data from 1 to N

import java.util.Scanner;

public class Node { //class
    int val;
    Node next;
    public Node (int N) { //create constructor
        val=N;
        next=null;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
       Node head=new Node(1); //create 1st node
       Node h1=head; //store the 1st node in h1, so we can return 1st node

       for (int i=2; i<=N; i++) {
           h1.next=new Node(i); //draw blocks to understand/ h.next will create new node but h wont update
           h1=h1.next; //h1 will move to next block/we have to update h1 or else the last new node created will be broken and after 1, 3 will be created etc
       }
      /* while (head!=null) {
           System.out.println(head.val);
           head=head.next;
       }*/
        System.out.println(head.val); //value of head node
    }
}

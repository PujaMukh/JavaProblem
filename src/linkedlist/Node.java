package linkedlist;
//given N>0, create a linked list which contains data from 1 to N

import java.util.Scanner;

public class Node {
    int val;
    Node next;
    public Node (int N) { //create constructor
        val=N;
        next=null;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
       Node head=new Node(1);
       Node h1=head;

       for (int i=2; i<=N; i++) {
           h1.next=new Node(i);
           h1=h1.next;
       }
       while (head!=null) {
           System.out.println(head.val);
           head=head.next;
       }
    }
}

package linkedlist;

import java.util.Scanner;

public class LinkedList { //outer container
    Node head;
    public LinkedList() { //empty container whose head will point to null
        head=null;
    }

    public void insert(int num) { //inserts a num to end of linked list

        if (head==null) {
            head=new Node(num); //1st node is created with value num and head points to 1st node
        }
        else {
            Node temp=head; //temp will 1st point to head and we will move temp later
            while (temp.next!=null) {
                temp=temp.next;  //move temp to last node
            }

            temp.next=new Node(num);  //temp.next should point towards the newly created node
        }

    }
    public int count() {
        Node temp=head;
        int count=0;
        while (temp!=null) {
            count=count+1;
            temp=temp.next;
        }
        return count;
    }
    public void kInsert(int k, int val) { //k is index, val is value to be inserted at k
        //k is 0 indexed
        Node temp=head; //always temp will start from head and move forward
        int count=0;
        while (temp!=null && count<k-1) {
            count++;
            temp=temp.next;
        }
        Node kth=new Node(val); //new node created
        kth.next=temp.next; //new node should point towards the next variable (same as temp.next) so connection is not broken on right side
        temp.next=kth;

    }
    public void print() {
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.val); //print the value which is in temp
            temp=temp.next; //move temp
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        LinkedList ls=new LinkedList(); //create blank linkedlist
        for (int i=1; i<=N; i++) {
            ls.insert(i); //method name is insert
        }
        ls.print(); //print is method name
        System.out.println(ls.count()); //count is method name
        ls.kInsert(3,100);
        ls.print();
    }

}

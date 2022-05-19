package linkedlist;

public class CreateLinkedList {
    public class Solution {
        public class LinkedList {
            ListNode head;

            public LinkedList() { //constructor
                head=null;
            }

        /*public class Node {
            int val;
            Node next;

            public Node(int x) { //constructor
                val=x;
                next=null;

            }
        }*/

            public void insertFirst(int num) {   //insert1st func
                if (head==null) {
                    head=new ListNode(num);
                }
                else {
                    ListNode temp=head;
                    head=new ListNode(num);
                    head.next=temp;
                }
            }

            public void insertLast(int num) {   //insertlast func
                if (head==null) {
                    head=new ListNode(num);
                }
                else {
                    ListNode temp=head;
                    while (temp.next!=null) {
                        temp=temp.next;
                    }
                    temp.next=new ListNode(num);
                }
            }

            public int size() { //to find size
                int count=0;
                ListNode temp=head;
                while (temp!=null) {
                    count=count+1;
                    temp=temp.next;
                }
                return count;
            }
            public void insertAtIndex(int val, int index) { //add a node before given index
                int count=size();
                if (index<0 || index>count) {
                    return;
                }
                if (count==0 && index==0) {
                    head=new ListNode(val);
                }
                else if (count>0 && index==0) {
                    ListNode temp=head;
                    head=new ListNode(val);
                    head.next=temp;
                }
                else {
                    int i=0;
                    ListNode temp=head;
                    while (i<index-1) {
                        i=i+1;
                        temp=temp.next;

                    }
                    ListNode temp1=new ListNode(val);
                    temp1.next=temp.next;
                    temp.next=temp1;

                }

            }

            public void deleteIndex(int index) {  //delete index
                int count=size();
                int i=0;
                if (count==0) {
                    return;
                }
                else if (index==0) {    //if we have to delete 0th index
                    ListNode temp=head;
                    head=head.next;
                    temp.next=null;
                }
                else {
                    if (index>0 && index<count) {
                        ListNode temp=head;
                        while (i<index-1) {
                            i=i+1;
                            temp=temp.next;
                        }
                        ListNode temp1=temp.next;
                        temp.next=temp.next.next;
                        temp1.next=null;



                    }
                }

            }
        }

        public ListNode solve(int[][] A) {
            LinkedList ls=new LinkedList();
            for (int i=0; i<A.length; i++) {
                if (A[i][0]==0) {
                    ls.insertFirst(A[i][1]);

                }
                else if (A[i][0]==1) {
                    ls.insertLast(A[i][1]);
                }
                else if (A[i][0]==2) {
                    ls.insertAtIndex(A[i][1], A[i][2]);
                }
                else {
                    ls.deleteIndex(A[i][1]);
                }
            }
            return ls.head;

        }
    }

}

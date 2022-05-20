package linkedlist;

public class InsertDeletePrint { //ignore this class
    public static class Node {
        int val;   //node class
        Node next;

        public Node(int x) { //constructor
            this.val=x;
            next=null;
        }

    }

    static Node head; //node head will be there

    public static int size() {
        int count=0;           //to get size
        Node temp=head;
        while (temp!=null) {
            count=count+1;
            temp=temp.next;
        }
        return count;
    }

    public static void insert_node(int position, int value) {
        position=position-1;
        int count=size();
        if (count==0 && position==0) {
            head=new Node(value);
        }
        else if (count==0 && position!=0) {
            return;
        }
        else if (count>0 && position==0) {
            Node temp=head;
            head=new Node(value);
            head.next=temp;
        }
        else if (position>0 && position<=count){
            if (head==null) {
                head=new Node(value);
            }
            else {
                Node temp=head;
                int i=0;
                while (i<position-1) {
                    i=i+1;
                    temp=temp.next;
                }
                Node temp1=new Node(value);
                temp1.next=temp.next;
                temp.next=temp1;
            }

        }



    }

    public static void delete_node(int position) {
        position=position-1;
        int count=size();
        if (count==0) {
            return;
        }

        if (count!=0 && position==0) {
            Node temp=head;
            head=head.next;
            temp.next=null;

        }
        else if (position>0 && position<count){
            Node temp=head;
            int i=0;
            while (i<position-1) {
                i=i+1;
                temp=temp.next;

            }
            Node temp1=temp.next;
            temp.next=temp.next.next;
            temp1.next=null;

        }



    }

    public static void print_ll() {
        // Output each element followed by a space
        Node temp=head;
        while (temp!=null) {
            if (temp.next != null) {
                System.out.print(temp.val+" ");
            } else {
                System.out.print(temp.val);
            }
            temp=temp.next;
        }
         System.out.println();
    }




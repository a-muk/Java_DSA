package LinkedList;

public class SinglyLinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //represent the head and tail of SLL
    public Node head= null;
    public Node tail=null;

    public void addnode(int data){
        Node newnode= new Node(data);
        if (head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }

    public void display(){
        Node current=head; //we are initialising head to a new variable becoz head can becomes
        //null once. So, now head is null- we are changing the total structure of
        //a linked list.
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list:");
        while (current!=null){
            System.out.println(current.data+" ");
            current=current.next;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyLinkedList slist=new SinglyLinkedList();
        slist.addnode(1);
        slist.addnode(2);
        slist.addnode(3);
        slist.addnode(4);

        slist.display();
    }

}



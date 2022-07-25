package LinkedList;

public class LL {
    //each of the nodes will contain it's own datatype
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    public void insert(int data){
        Node node=new Node(data); //creating a new node
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size+=1;
    }

    public void display() {
        Node current = head; //we are initialising head to a new variable becoz head can becomes

        //null once. So, now head is null- we are changing the total structure of
        //a linked list
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list:");

        System.out.println();
    }


    private class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
        }
    }

}
